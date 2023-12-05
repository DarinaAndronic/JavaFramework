package OOPconcepte;

import java.util.List;

public class FabricaAudi extends FabricaMasina {

    public Integer pretstandard; //este o variabila alocata doar la acceasta clasa copil
    public Integer pretfinal;
    public List<String> dotariExterioare;

    public FabricaAudi(String model, String sasiu, String culoare, Integer motorizare, Integer pret, List<String> dotariExterioare) {
        super("Audi", model, sasiu, culoare, motorizare);


        this.dotariExterioare = dotariExterioare;
    }


    public void prezentareAudi() {
        prezentaremasina();
        definirepretmodel();
        calculpretfinal();
        if (dotariExterioare == null) {
            System.out.println("Pretul standard al masinii este " + pretstandard + "euro");
        else
            {
                System.out.println("Pretul standard al masinii este " + pretstandard + "euro");
                System.out.println("Pretul final al masinii este " + pretfinal + "euro");
            }
        }

        System.out.println("Dotarile exterioare ale masinii sunt " + dotariExterioare);

    }

    public void definirepretmodel() {
        switch (getModel()) {
            case "A5":
                pretstandard = 40000;
                break;
            case "A7":
                pretstandard = 80000;
                break;
            default:
                System.out.println("Nu mai avem pe stoc acest model");
        }

    }

    public void calculpretfinal() {
        Integer pretdotari=0;
        for (Integer i = 0; i < dotariExterioare.size(); i++) ;
        {
            int i;
            switch (dotariExterioare.get(i)) {
                ;
                case "jenti":
                    pretdotari = pretdotari + 500;
                    break;
                case "trapa":
                    pretdotari = pretdotari + 900;
                    break;
                case "faruri":
                    pretdotari = pretdotari + 1000;
                    break;
                case "spoiler":
                    pretdotari = pretdotari + 650;
                    break;
                case "oglinzi":
                    pretdotari = pretdotari + 2000;
                    break;
            }
        }
        pretfinal=pretdotari+pretstandard;
    }

    //suprascriem metoda angajari_firma din parinte - propria implementare a fabricii cu acelasi nume
    public void angajari_firma()
    {
        System.out.println("Fabrica Audi are 4 locuri disponibile pt angajare!");
    }

}
