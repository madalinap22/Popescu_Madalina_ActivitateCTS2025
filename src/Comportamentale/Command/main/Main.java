package Comportamentale.Command.main;

import Comportamentale.Command.model.*;

public class Main {
    public static void main(String[] args) {


        IPachet cazare = new PachetCazare(1, "Roma");
        IPachet transp = new PachetTransport(2, "Paris");

//        IComanda cv = new ComandaVanzare(cazare);

    }
}
