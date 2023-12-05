package OOPconcepte;

import Obiect.Fabrica_masini;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test

    public void testmethod(){

        List<String> dotariAudiA5=new ArrayList<>();
        dotariAudiA5.add("jenti");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");


        FabricaAudi audiA5=new FabricaAudi ("A5","sedan","rosie",20, dotariAudiA5);

        audiA5.prezentareAudi();

        audiA5.setModel("A8");

        audiA5.prezentareAudi();

        audiA5.angajari_firma();

        audiA5.afisarerezultate();
        audiA5.afisarerezultate(2022);
        audiA5.afisarerezultate("A5");
        audiA5.afisarerezultate("A5", 2022 );

       // FabricaAudi audiA7=new FabricaAudi("Audi")
    }

}
