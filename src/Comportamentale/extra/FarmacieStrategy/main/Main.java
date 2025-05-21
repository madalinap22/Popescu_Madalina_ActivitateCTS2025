package Comportamentale.extra.FarmacieStrategy.main;

import Comportamentale.extra.FarmacieStrategy.model.Card;
import Comportamentale.extra.FarmacieStrategy.model.Cash;
import Comportamentale.extra.FarmacieStrategy.model.Client;
import Comportamentale.extra.FarmacieStrategy.model.IModPlata;

public class Main {
    public static void main(String[] args) {
        IModPlata mod1 = new Card();
        IModPlata mod2 = new Cash();

        Client c1 = new Client("Andreea", mod1);
        c1.plateste(5000);

        c1.setModPlata(mod2);
        c1.plateste(300);


    }
}
