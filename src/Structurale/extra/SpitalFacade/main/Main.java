package Structurale.extra.SpitalFacade.main;

import Structurale.extra.SpitalFacade.model.Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> paturiDisponibile = new ArrayList<>();
        paturiDisponibile.add(1);
        paturiDisponibile.add(5);

        Facade facade = new Facade();
        facade.interneazaPacient("Alexandru", 1, "Ioana G.", "ORL",
                paturiDisponibile);

    }
}
