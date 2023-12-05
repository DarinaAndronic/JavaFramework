package Structuri_repetitive;

import org.testng.annotations.Test;

public class Caine {
    // structuri repetitive = for, while, for each

    @Test
    public void metoda_test(){
       //afisare_numere_for();
       //afisare_numere_while();
        //numele_meu_de_5_ori();
        //suma_primelor_10_numere();
        afisare_nr_div_cu_5();
    }

    //afisam primele 10 numere
    public void afisare_numere_for ()//pt for ai nevoie de 3 date, de unde pornesti, pana unde vrei sa ajungi si din cat in cat sa mearga
    {
        for (Integer index=0;index<50;index++){
            //index++ incrementeaza cu 1, se mai poate utiliza index=index+1
            System.out.println(index);
        }
    }
    public void afisare_numere_while()
    {
     Integer index=0;
     while (index<50){
         System.out.println(index);
         index++;
     }
    }

    //afisam numele nostru de 5 ori

    public void numele_meu_de_5_ori()
    {
        for (Integer x=0; x<5; x++)
        {
            System.out.println("Darina");
        }

    }
    //calcum suma primelor 10 numere

    public void suma_primelor_10_numere()
    {
        Integer x=0;
        Integer suma=x;
        while (x<=10)
        {
            suma=suma+x;
            x++;
        }
        System.out.println("Suma primelor 10 numere este "+suma);

    }

    // afisam primele 3 numere divizibile cu 5
    public void afisare_nr_div_cu_5()
    {
        Integer a=0;
        for(Integer x=0; x<21; x++) {
            if (x % 5 == 0 && a<3) {
                a++;
                System.out.println(x);
            }

           // if (a == 3) {
           //     break;
           // }
        }

    }

}

