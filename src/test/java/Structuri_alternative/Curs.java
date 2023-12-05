package Structuri_alternative;

import org.testng.annotations.Test;

public class Curs {
    //structurile pot sa fie de 2 feluri: alternative si repetitive
    //1. structuri alternative: if...then...else,swith....case

    @Test
    public void test_metod(){
//        verific_nr_mai_mare(9);
//        verific_nr_mai_mare(1);
//        verific_nr_mai_mare(5);
//        verific_nr_mai_mare(-6);
//        verific_nr_mai_mare(4);
//        verific_nr_mai_mare(6);
        persoana_majora(17);
        persoana_majora(18);
        persoana_majora(19);
    }

    //verificam daca un nr este mai mare decat 5
    public void verific_nr_mai_mare(Integer nr){
        if (nr>5) {
            System.out.println("Numarul "+nr+" este mai mare ca 5");
        }
        else {
            System.out.println("Numarul "+nr+" este mai mic decat 5");
        }
    }

  //verificam daca un nr este par si pozitiv
  public void verific_nr_par(Integer nr){
        //daca vreau catul = / (div)
       // daca vreau restul = % (mod)
        if(nr>0){
           if(nr%2==0){
               System.out.println("Numarul "+nr+"  este par si pozitiv");
           }
           else {
               System.out.println("Numarul "+nr+" este impar si pozitiv");
           }
        }
        else if (nr<0){
            if(nr%2==0){
                System.out.println("Numarul "+nr+" este par si negativ");
            }
            else {
                System.out.println("Numarul "+nr+" este impar si negativ");
            }
        }
        else{
            System.out.println("Numarul "+nr+" este 0");
        }
  }

  //verificam daca o persoana este majora
    public void persoana_majora(Integer varsta){
        if (varsta>=18) {
            System.out.println("Persoana cu varsta de "+varsta+" ani este majora");
        }
        else{
            System.out.println("Persoana cu varsta"+varsta+" ani nu este majora");
        }
    }
}
