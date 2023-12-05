package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

public class Cursant {
    //primul curs mai greu
    //Clasa = sablon specific unui obiect care contine variabile si metode
        //Identificam o clasa dupa cuvantul "class"
        //O clasa trebuie sa aibe un nume
        //Continutul unei clase se regaseste intre acolade {}
        //Intr-un fisier Java putem avea mai multe clase

                //Variabila = proprietate a unei clase (ex:nume, prenume, varsta, etc)
                    //Variabilele sunt de 2 feluri: Global si local
                        //Variabila globala = este vizibila peste tot in clasa (nu are anumite restrictii)
                        //Variabila locala = are o anumita restrictie/ este vizibila doar in locul declarat
                        //Variabila globala = public "tip de data" "nume variabila" (public strig nume)
                    //Variabila poate sau nu sa primeasca o valoare
                //Metoda = actiunea unei clase/se termina cu () si se scrie intre acolade {}
                     //Metodele sunt de 2 feluri: void (actiune care nu asteapta actiune) si return (actiune care asteapta o actiune in schimb)
                        //Void = metoda care executa si arata actiunea
                        //Return = metoda care returneaza actiunea
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;//se scrie intre ghilimele simple ''
    public Boolean AreStudii;

    @Test
    public void metoda_test(){
        afisaredate();
        calcul_medie("Semestrul 1",9.25, 6.50);
        calcul_medie("Semestrul 2",8.00,7.50);
        calcul_pret(10);
        calcul_pret(20);
    }//metoda de test prin care se cheama fiecare metoda pt a nu pune @test la fiecare metoda in parte
    public void afisaredate()
    {
        Nume="Andronic";
        Prenume="Darina";
        Varsta=36;
        Adresa="str. x, nr. 10";
        Inaltime=1.73;
        Greutate=94.0f; //o vede ca si double dar daca ii pui un f il recunoaste float; float tip de data pe 32biti, iar double merge pe 64biti
        Sex='F';
        AreStudii=true;
        System.out.println("Numele cursantului este: "+Nume+' '+Prenume);//printeaza pe linia urm.
        System.out.println("Varsta cursantului este: "+Varsta);
        System.out.println("Adresa cursantului este: "+Adresa);
        System.out.println("Greutatea cursantului este: "+Greutate);
        System.out.println("Sexul cursantului este: "+Sex);
        System.out.println("Are cursantul studii? "+AreStudii);
    }
    public void calcul_medie(String tipnote, Double Nota1, Double Nota2){
        //Double Nota1=7.50;//variabila locala, nu este publica, daca ai vrea sa o folosesti mai sus nu poti
        //Double Nota2=10.00;
        Double Medie=(Nota1+Nota2)/2;
        System.out.println("Media cursantului pt: "+tipnote+" este: "+Medie);
    }
    public void calcul_pret(Integer reducere)
    {
        Integer pret=1000;
        //Integer reducere=discount;
        System.out.println("Pretul initial este: "+pret);
        Integer pret_final=(pret-(pret*reducere)/100);
        System.out.println("Pretul final: "+pret_final);
    }



}
