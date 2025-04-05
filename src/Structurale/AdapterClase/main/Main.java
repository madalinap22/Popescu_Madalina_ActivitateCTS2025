package Structurale.AdapterClase.main;

import Structurale.AdapterClase.classes.Pachet;
import Structurale.AdapterClase.classes.PachetMasina;
import Structurale.AdapterClase.classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new Pachet("Barcelona", 23f);
        pachet.rezervaPachet();

        PachetMasina p = new PachetMasina("audi", 266);
        p.rezervaPachet();





    }
}
