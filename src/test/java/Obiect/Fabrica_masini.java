package Obiect;

public class Fabrica_masini {

    //constructor=are ca rol sa initializeze atributele unei clase
    //un constructor este public si are acelasi nume cu clasa
    //un constructor poate fi de 2 feluri: cu parametri si fara parametri
    //un constructor fara parametri se mai numeste si default
    //daca nu am definit noi un constructor avem unul default
    //intr-o clasa putem avea n constructori diferentiati prin numar sau tip de parametri


    //obiect=instanta unei clase
    //un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective


    //dintr-o clasa putem initializa N obiecte
    //in momentul in care initilizam un obiect apelam constructorul din clasa

    public  String marca_masina;
    public String model_masina;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public Fabrica_masini(String marca_masina, String model_masina, String combustibil,
                          String transmisie, Integer an, Double motorizare)
    {
        this.marca_masina = marca_masina;
        this.model_masina = model_masina;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public Fabrica_masini(String marca_masina, String model_masina, String combustibil, String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca_masina = marca_masina;
        this.model_masina = model_masina;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentare_produs() {
        System.out.println("Marca masinii este: " + marca_masina);
        System.out.println("Modelul masinii este: " + model_masina);
        System.out.println("Tipul de combustibil este: " + combustibil);
        System.out.println("Transmisia este: " + transmisie);
        System.out.println("Anul de fabricatie este: " + an);
        System.out.println("Motorizarea este:" + motorizare);
        if(pret != null)
        {
            System.out.println("Pretul masinii este:" + pret);
        }
    }

    public void calcul_impozit()
    {
        if(an>=2020 && combustibil.equals("Electric"))
        {
            System.out.println("Impozitul clientului este de 5 lei");
        }
        else
        {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masini");
        }
    }


}
