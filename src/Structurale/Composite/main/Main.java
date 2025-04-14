package Structurale.Composite.main;

import Structurale.Composite.model.Categorie;
import Structurale.Composite.model.IOptiune;
import Structurale.Composite.model.Item;

public class Main {
    public static void main(String[] args) throws Exception {
        IOptiune categorie1 = new Categorie("Destinatii");
        IOptiune categorie2 = new Categorie("Europa");
        IOptiune categorie3= new Categorie("Africa");

        IOptiune item1 = new Item("Albania");
        IOptiune item2 = new Item("Bulgaria");
        IOptiune item3 = new Item("Egipt");
        IOptiune item4 = new Item("Maroc");

        categorie3.adaugaNod(item3);
        categorie3.adaugaNod(item4);

        categorie2.adaugaNod(item1);
        categorie2.adaugaNod(item2);

        categorie1.adaugaNod(categorie2);
        categorie1.adaugaNod(categorie3);

        categorie1.descriere();
    }
}
