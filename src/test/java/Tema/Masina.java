package Tema;

import org.testng.annotations.Test;

public class Masina {
    public String Marca;
    public String Model;
    public Integer An_fabricatie;
    public Integer Pret_eur;
    public String Cai_putere;
    public String Combustibil;
    public String Transmisie;
    public String Viteza_max;
    public Float Acceleratie;
    @Test
    public void afisare_detalii_auto()
    {
        Marca="Alfa Romeo";
        Model="Veloce";
        An_fabricatie=2018;
        Pret_eur=61370;
        Cai_putere="280CP";
        Combustibil="Benzina";
        Transmisie="Automata";
        Viteza_max="240 km/h";
        Acceleratie=5.7f;

        System.out.println("Marca masinii: "+Marca+"/"+"Model: "+Model+"/"+"An fabricatie: "+An_fabricatie);
        System.out.println("Pret: "+Pret_eur+"/"+"Puterea masinii: "+Cai_putere);
        System.out.println("Tip transmisie: "+Transmisie+"/"+"Viteza maxima: "+Viteza_max);
    }
}
