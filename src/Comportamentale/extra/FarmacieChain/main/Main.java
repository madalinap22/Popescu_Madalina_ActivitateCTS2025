package Comportamentale.extra.FarmacieChain.main;

import Comportamentale.extra.FarmacieChain.model.*;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Nume 1", 1550);

        AContResponsabil resp1 = new ContResponsabil1(300);
        AContResponsabil resp2 = new ContResponsabil2(450);
        AContResponsabil resp3 = new ContResponsabil3(550);

        resp1.setUrmatorulResponsabil(resp2);
        resp2.setUrmatorulResponsabil(resp3);

        resp1.plateste(c1);

    }
}
