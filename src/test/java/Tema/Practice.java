package Tema;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {
    String MesajSalut;
    Integer Varsta;
    String Nume;
    String Prenume;
    String DataDeAzi;
    String OraDeAzi;
    String ZiuaDeAzi;
    Double d1;
    Double d2;
    Double d3;
    Integer i1;
    Integer i2;

    @Test
    public void testare() {
        d1 = 3.5;
        d2 = 6.2;
        d3 = 9.4;
        i1 = 3;
        i2 = 7;

        afisare_date();
        rezultat();

        System.out.println("Suma numerelor de tip double este: ");
        suma_3_nr_double(d1, d2, d3);
        System.out.println("Produsul numerelor de tip integer este: ");
        produs_2_numere_integer(i1, i2);
        concatenare();
        System.out.println("SALUT"+"M");
        System.out.println("H"+"HELLO");
        String ana="pom"+verificare_vocala("pom");
        String are="are"+verificare_vocala("are");
        String mere="mere"+verificare_vocala("mere");
        String pere="pere"+verificare_vocala("pere");
        String prune="prune"+verificare_vocala("prune");

        System.out.println(ana+" " +are+" " + mere+"," +pere+","+prune);
        System.out.println(verificare_vocala("copac"));
        verificare_interval(16);
    }

    public void afisare_date() {
        MesajSalut = "Hello World";
        Varsta = 35;
        Nume = "Andronic";
        Prenume = "Darina";

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtfd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DataDeAzi = ldt.format(dtfd);

        LocalDateTime hour = LocalDateTime.now();
        DateTimeFormatter local_hour = DateTimeFormatter.ofPattern("HH:mm");
        OraDeAzi = hour.format(local_hour);

        LocalDateTime Day = LocalDateTime.now();
        ZiuaDeAzi = Day.getDayOfWeek().name();

        //DataDeAzi= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        //OraDeAzi= LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        //ZiuaDeAzi= LocalDateTime.now().getDayOfWeek().name();

        System.out.println(MesajSalut);
        System.out.println("Varsta mea este: " + Varsta);
        System.out.println(Nume);
        System.out.println(Prenume);
        System.out.println("Care ii data de astazi?");
        System.out.println(DataDeAzi);
        System.out.println(OraDeAzi);
        System.out.println(ZiuaDeAzi);
    }

    public void rezultat() {
        Integer rezultat;
        rezultat = (2 + 3 * 4 - 3) / 3;
        System.out.println("Cat face: [2+(3*4)-3]/3?");
        System.out.println("Rezultatul corect este: " + rezultat);
    }

    public void suma_3_nr_double(Double nr1, Double nr2, Double nr3) {
        Double Suma = nr1 + nr2 + nr3;
        System.out.println(Suma);
    }

    public void produs_2_numere_integer(Integer nr1, Integer nr2) {
        Integer Suma2 = nr1 * nr2;
        System.out.println(Suma2);
    }

    public void concatenare() {
        System.out.println("Stiu ca am calculat bine ");
        suma_3_nr_double(d1, d2, d3);
        System.out.println(" si ");
        produs_2_numere_integer(i1, i2);
    }
    public String verificare_vocala(String cuvant)
    {
        String ultim_char=cuvant.substring(cuvant.length()-1);

        //System.out.println(ultim_char);
        if (ultim_char.equals("a")||ultim_char.equals("e")||ultim_char.equals("i")||ultim_char.equals("o")||ultim_char.equals("u"))
            return "z";

        return "";
    }
    public void verificare_interval(int nr){
        if(nr>=8&&nr<=15)
            System.out.println("Numarul "+nr+" este cuprins in intervalul [8,15]");
        else
            System.out.println("Numarul "+nr+" nu este cuprins in intervalul [8,15]");
    }

}
