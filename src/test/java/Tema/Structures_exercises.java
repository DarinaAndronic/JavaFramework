package Tema;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Structures_exercises {
    @Test
    public void metada_test() {
        //suma_primelor_2_numere(3,5,1);
        //afisare_DA_5_ori();
        //afisare_Da_5_ori_alta_metoda();
        //primele_5_numere_div_3();
        //primele_3_numere_div_5();
        //primele_4_nr_pozsipare();
        //suma_nr_pana_la_nr(7);
        produsul_numerelor_pana_la_5();
    }

    public void suma_primelor_2_numere(Integer x, Integer y, Integer z) {
        if (x + y == z) {
            System.out.println("Suma lui " + x + " + " + y + " este egala cu " + z);
        } else {
            if (x + y > z) {
                System.out.println("Suma lui " + x + " + " + y + " este mai mare decat " + z);
            } else
                System.out.println("Suma lui " + x + " + " + y + " este mai mica decat " + z);
        }
    }

    public void afisare_DA_5_ori() {
        for (Integer x = 0; x < 5; x++) {
            System.out.print("DA ");
        }
    }

    public void afisare_Da_5_ori_alta_metoda() {
        Integer x = 0;
        while (x < 5) {
            System.out.print("DA ");
            x++;
        }
    }

    public void primele_5_numere_div_3() {
        Integer nr = 0;
        System.out.println("Primele 5 numere divizibile cu 3 sunt: ");
        for (Integer cat = 0; cat < 100; cat++) {
            if (cat % 3 == 0 && nr < 5) {
                nr++;
                System.out.println(cat);
            }
        }
    }

    public void primele_3_numere_div_5() {
        Integer nr = 0;
        System.out.println("Primele 3 numere divizibile cu 5 sunt: ");
        for (Integer cat = 0; cat < 100; cat++) {
            if (cat % 5 == 0 && nr < 3) {
                nr++;
                System.out.println(cat);
            }
        }
    }

    public void primele_4_nr_pozsipare() {
        Integer nr = 0;
        System.out.println("Primele 4 numere pare si pozitive sunt: ");
        for (Integer cat = 0; cat < 100; cat++) {
            if (cat % 2 == 0 && cat >= 0 && nr < 4) {
                nr++;
                System.out.println(cat);
            }

        }
    }

    public void suma_nr_pana_la_nr (Integer nr)
    {
        Integer x=0;
        Integer suma=0;
        while (x<=nr)
        {
            suma=suma+x;
            x++;
        }
        System.out.println("Suma numerelor pana la "+nr+" este: "+ suma);
    }

    public void produsul_numerelor_pana_la_5 ()
    {
        Integer x=1;
        Integer produs=x;
        while (x<=5)
        {
            produs=produs*x;
            x++;
        }
        System.out.println("Produsul numerelor pana la 5 este: "+produs);
    }
}