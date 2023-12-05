package OOPconcepte;

public class FabricaMasina {
    //OOP=programarea orientata pe obiect
    // 4 principii = mostenire, incapsulare, abstractizare si polimorfism
    //Mostenire = conceptul prin care clasa parinte este mostenbita de clasa copil
    //          - in java o clasa poate sa mosteneasca doar o singura clasa
    //          - clasa copil trebuie sa apeleze constructorul din clasa parinte
    //          - copilul are vizibilitate asupra metodelor/variabilelor din parinte daca sunt publice/protected
    //          - ca sa apelam constructorul parinte in clasa copil vom folosi super

    //Acces control: public, private, protected, default
    //Public = ofera vizibilitate pt oricine si oriunde in tot proiectul
    //Private = ofera vizibilitate doar in interiorul clasei

    //



    private String marca;
    private String model;
    private String sasiu;
    private String culoare;
    private Integer motorizare;

    public FabricaMasina (String marca, String model, String sasiu, String culoare, Integer motorizare){
        this.marca = marca;
        this.model = model;
        this.sasiu=sasiu;
        this.culoare=culoare;
        this.motorizare=motorizare;

    }

    public void prezentaremasina(){

        System.out.println("marca masinii este " + marca);
        System.out.println("modelul masinii este " + model);
        System.out.println("msasiul masinii este " + sasiu);
        System.out.println("culoarea masinii este " + culoare);


    }
    //Polimorfism = conceptul prin care o metoda poate suferi modificari la nivel de continut sau structura
    //Polimorfism - este de 2 feluri: dinamic(override) si static(overload)
    //Polimorfismul dinamic = intr-o ierarhie de clase extinse prin mostenire  o metoda poate avea implementari diferite
    //Polimorfismul static = mai multe metode pot avea acelasi nume cu conditia sa se diferentieze prin numar sau tip de parametri
    //la metodele de return nu se poate aplica polimorfism!ci la cele cu void.

    //Polimorfism dinamic
    public void angajari_firma()
    {
        System.out.println("Fabrica mama nu mai face angajari");
    }



    //ca sa accesam valoarea unei variabile private cu private ne folosim de conceptul GET
    //ca sa modificam valoarea unie variabile private cu private ne folosim de conceptul SET


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Integer motorizare) {
        this.motorizare = motorizare;
    }
}
