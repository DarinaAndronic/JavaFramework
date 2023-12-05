package Obiect;

import org.testng.annotations.Test;

public class Obiect_Test
{
@Test
public void test_method()
{
 Fabrica_masini Mercedes_G63AMG = new Fabrica_masini("Mercedes", "G 63 AMG",
         "Electric", "Manual", 2023, 4.89);


 Mercedes_G63AMG.prezentare_produs();

 Mercedes_G63AMG.calcul_impozit();
    System.out.println("=============================");

 Fabrica_masini DaewooMatiz=new Fabrica_masini("Daewoo", "Matiz", "Motorina",
         "Manual", 2000, 1.9);

 DaewooMatiz.prezentare_produs();
 DaewooMatiz.calcul_impozit();
 System.out.println("=============================");

 Fabrica_masini Audi=new Fabrica_masini("Audi", "R8",
         "Electric","Automat", 2022, 3.2, 99000);
 Audi.prezentare_produs();
 Audi.calcul_impozit();
}

}
