package extra4.Strategy.main;

import extra4.Strategy.model.Card;
import extra4.Strategy.model.Client;
import extra4.Strategy.model.IModPlata;
import extra4.Strategy.model.SMS;

public class Main {
    public static void main(String[] args) {

        IModPlata mod1 = new Card();
        IModPlata mod2 = new SMS();

        Client c1 = new Client("Ana", mod1);
        c1.plateste(200f);

        c1.setModPlata(mod2);
        c1.plateste(300f);
    }
}
