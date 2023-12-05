package Multimi;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    @Test
public void metoda_test()
    {
//        nume_cursanti_array();
//        nume_cursanti_lista();
//        obiecte_hashmap();
        //Tari_Orase();
        retete("Tiramisu ");
    }
    //afisam numele cursantilor
    public void nume_cursanti_array()
    {
String[] nume_prenume=new String[4]; //defineste o multime de string-uri unde poti introduce "n" elemente
        nume_prenume[0]="Adi";
        nume_prenume[1]="Anca";
        nume_prenume[2]="Andreea";
        nume_prenume[3]="Claudia";
        for (Integer index=0; index<nume_prenume.length;index++)
        {
            System.out.println(nume_prenume[index]);
        }
    }

    public void nume_cursanti_lista()
    {
        List<String> nume_prenume=new ArrayList<>(); //la lista nu trebuie sa ii specifici dimensunea ca si la array
        nume_prenume.add("Cosmin");
        nume_prenume.add("Diana");
        nume_prenume.add("Letitia");
        nume_prenume.add("Oana");
        for (Integer index=0; index<nume_prenume.size();index++)
        {
            System.out.println(nume_prenume.get(index));
        }
    }

    //hashmap=key-value
    public void obiecte_hashmap()
    {
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("Electronic", "Telefon");
        obiecte.put("Mancare", "Supa");
        obiecte.put("Masina", "Ford");
        for (String Key: obiecte.keySet())
        {
            System.out.println("Cheia este: "+Key);
            System.out.println("Valoarea este: "+obiecte.get(Key));
        }
    }

    //reprezentam niste tari cu  mai multe orase- tara=key, orase=values

    public void Tari_Orase()
    {
        HashMap<String,List<String>> testdata=new HashMap<>();

        List<String> oraseRO= new ArrayList<>();

        oraseRO.add("Bucuresti");
        oraseRO.add("Timisoara");
        oraseRO.add("Cluj");

        List<String> oraseIT=new ArrayList<>();

        oraseIT.add("Roma");
        oraseIT.add("Venetia");
        oraseIT.add("Florenta");

        List<String> oraseES=new ArrayList<>();

        oraseES.add("Madrid");
        oraseES.add("Barcelona");
        oraseES.add("Sevilla");

        testdata.put("Romania",oraseRO);
        testdata.put("Italia",oraseIT);
        testdata.put("Spania",oraseES);

        for (String Key: testdata.keySet())
        {
            System.out.println("Tara este: "+Key);
            System.out.println("Orasele sunt urmatoarele: "+testdata.get(Key));
            //o alternativa de afisare sub forma de lista, una sub alta...nu sub forma de vector

            //System.out.println("Orasele sunt urmatoarele: ");
//            List<String>Orasele_curente= testdata.get(Key);
//            for (Integer index=0; index<Orasele_curente.size();index++)
//            {
//                System.out.println(Orasele_curente.get(index));
//            }
        }

    }

    //definim reteta de gatit
    public void retete(String reteta_solicitata)
    {
     HashMap<String, List<String>> carte_bucate=new LinkedHashMap<>();//LinkedHashMap afiseaza in ordinea in care ai scris tu
     List<String> ciorba_radauteana=new ArrayList<>();
     ciorba_radauteana.add("Morcov - 2 buc");
     ciorba_radauteana.add("Ceapa - 1 buc");
     ciorba_radauteana.add("Ardei - 1 buc");
     ciorba_radauteana.add("galenus ou - 1 buc");
     ciorba_radauteana.add("apa - 4l");
     ciorba_radauteana.add("carne pui - 500gr");
     ciorba_radauteana.add("sare si piper dupa gust");

     List<String> Tiramisu=new ArrayList<>();
     Tiramisu.add("Piscot - 500gr");
     Tiramisu.add("Oua - 4 buc");
     Tiramisu.add("Mascarpone - 500gr");
     Tiramisu.add("Cafea - 200ml");

     carte_bucate.put("Ciorba radauteana ", ciorba_radauteana );
     carte_bucate.put("Tiramisu ", Tiramisu);
        for (String Key: carte_bucate.keySet()) {
            if (Key.equals(reteta_solicitata)) {


                System.out.println("Reteta este pt: " + Key);
                System.out.println("Ingredientele pt aceasta retea sunt urmatoarele: " + carte_bucate.get(Key));
            }
        }


    }

}


