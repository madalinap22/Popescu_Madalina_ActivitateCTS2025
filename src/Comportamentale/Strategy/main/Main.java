package Comportamentale.Strategy.main;

import Comportamentale.Strategy.model.*;

public class Main {
    public static void main(String[] args) {

        IModPlata mod1 = new Card();
        IModPlata mod2 = new Cash();
        IModPlata mod3 = new PayPal();

        Client client1 = new Client("Andreea", mod1);
        client1.plateste(5000);

        client1.setModPlata(mod2);
        client1.plateste(400);

    }
}
