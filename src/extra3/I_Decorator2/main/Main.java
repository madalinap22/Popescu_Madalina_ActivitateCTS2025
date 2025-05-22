package extra3.I_Decorator2.main;

import extra3.I_Decorator2.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaSectii = new ArrayList<>();
        listaSectii.add("Chirurgie");
        listaSectii.add("Oftalmologie");
        ISpital spital = new Spital(listaSectii, "Spital1");

        Vizitator vizitator1 = new Vizitator("Nume1", 20, true);
        spital.accesSalon(vizitator1);

        Vizitator vizitator2 = new Vizitator("Nume2", 23, true);
        Vizitator vizitator3 = new Vizitator("Nume3", 40, true);
        List<Vizitator> listaVizitatori = new ArrayList<>();
        listaVizitatori.add(vizitator1);
        listaVizitatori.add(vizitator2);
        listaVizitatori.add(vizitator3);

        ASpitalDecorator dec1 = new SpitalDecorat(spital, listaVizitatori);
        dec1.accesSalon(vizitator1);
        dec1.accesSalonEchipaj(vizitator2);
    }
}
