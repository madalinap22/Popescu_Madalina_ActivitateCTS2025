package Structurale.extra.Composite.main;

import Structurale.extra.Composite.model.Categorie;
import Structurale.extra.Composite.model.IOptiune;
import Structurale.extra.Composite.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //MC->Item

        IOptiune c1 = new Categorie("Mic dejun");
        IOptiune c2 = new Categorie("Pranz");
        IOptiune c3 = new Categorie("Cina");
        IOptiune c4 = new Categorie("Meniul zilei");

        List<String> lista = new ArrayList<>();
        lista.add("ingredient1");
        lista.add("ingredient2");
        IOptiune it1 = new Item("Omleta", lista,23.6f);
        IOptiune it2 = new Item("Ciorba", lista,23.6f);
        IOptiune it3 = new Item("Salata", lista,23.6f);
        IOptiune it4 = new Item("Cartofi", lista,23.6f);
        IOptiune it5 = new Item("Cotlet", lista,23.6f);

        c1.adaugaNod(it1);
        c2.adaugaNod(it2);
        c3.adaugaNod(it3);
        c3.adaugaNod(it4);
        c3.adaugaNod(it5);
        c4.adaugaNod(it2);
        c4.adaugaNod(it5);
        c4.adaugaNod(it4);


        c1.descriere();
        c2.descriere();
        c3.descriere();
        c4.descriere();



    }
}
