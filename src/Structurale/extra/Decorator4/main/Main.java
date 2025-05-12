package Structurale.extra.Decorator4.main;

import Structurale.extra.Decorator4.model.AProdusDecorator;
import Structurale.extra.Decorator4.model.IProdus;
import Structurale.extra.Decorator4.model.Produs;
import Structurale.extra.Decorator4.model.ProdusDecorat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("ingredient1");
        lista.add("ingredient3");
        lista.add("ingredient2");
        IProdus p1 = new Produs("Produs1", 25.4f,lista);
        IProdus p2 = new Produs("Produs2", 20.4f,lista);
        IProdus p3 = new Produs("Produs3", 250.4f,lista);
        IProdus p4 = new Produs("Produs4", 125.4f,lista);

        AProdusDecorator produsDecorator1 = new ProdusDecorat(p1);
        AProdusDecorator produsDecorator2 = new ProdusDecorat(p2);
        AProdusDecorator produsDecorator3 = new ProdusDecorat(p3);
        AProdusDecorator produsDecorator4 = new ProdusDecorat(p4);

        produsDecorator1.getDescriereIngrediente();
        produsDecorator1.getPret();

        produsDecorator2.getDescriereIngrediente();
        produsDecorator2.getPret();

        produsDecorator3.getDescriereIngrediente();
        produsDecorator3.getPret();

        produsDecorator4.adaugaTopping("caramel");
        produsDecorator4.getDescriereIngrediente();
        produsDecorator4.getPret();
    }
}
