package extra4.Composite.main;

import extra4.Composite.model.Categorie;
import extra4.Composite.model.IOptiune;
import extra4.Composite.model.ItemFiliala;

public class Main {
    public static void main(String[] args) {
        IOptiune categorie1 = new Categorie("Sucursala 1");
        IOptiune subcategorie1 = new Categorie("Agentie 1");
        ItemFiliala item1 = new ItemFiliala("Filiala Item1");

        categorie1.adaugaNod(subcategorie1);
        subcategorie1.adaugaNod(item1);

        categorie1.metodaSpecificaAfiseaza();
    }
}
