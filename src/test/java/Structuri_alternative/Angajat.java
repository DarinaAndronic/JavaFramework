package Structuri_alternative;

import org.testng.annotations.Test;

public class Angajat {
    @Test
    public void metoda_test(){
    zilele_saptamanaii(3);
    }
    //switch = evalueaza o valoare
    //if =  verifica o conditie

    //reprezentam zilele saptamanii
    public void zilele_saptamanaii(Integer zi)
    {
        switch (zi){
            case 1:
                System.out.println("Azi este duminica");
                break;
            case 2:
                System.out.println("Azi este luni");
                break;
            case 3:
                System.out.println("Azi este marti");
                break;
            case 4:
                System.out.println("Azi este miercuri");
                break;

        }
    }
}
