package Structurale.Flyweight.main;

import Structurale.Flyweight.model.FabricaFlyweight;
import Structurale.Flyweight.model.IPachetTuristic;
import Structurale.Flyweight.model.Optional;

public class Main {
    public static void main(String[] args) {
        //1.fabrica

        FabricaFlyweight fabrica = new FabricaFlyweight();
        Optional optional1 = new Optional(true, 4);
        Optional optional2 = new Optional(false, 2);
        Optional optional3 = new Optional(true, 3);
        Optional optional4 = new Optional(false, 5);

        //prin apel functie getPachetTuristic din Fabrica
        IPachetTuristic pachet = fabrica.getPachetTuristic(1, "Hotel1", "Destinatie1", true);
        pachet.descriere(optional1);
        pachet.descriere(optional4);
    }
}
