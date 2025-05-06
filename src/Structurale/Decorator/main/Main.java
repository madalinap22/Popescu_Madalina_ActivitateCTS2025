package Structurale.Decorator.main;

import Structurale.Decorator.model.PachetCazare;
import Structurale.Decorator.model.PachetCazareDecorator;
import Structurale.Decorator.model.IPachetTuristic;
import Structurale.Decorator.model.APachetTuristicDecorator;

public class Main {
    public static void main(String[] args) {
        IPachetTuristic pachet = new PachetCazare("lisabona",4500,true);
        pachet.rezervaPachet();
        APachetTuristicDecorator pachetTuristicDecorator = new PachetCazareDecorator(pachet);
        pachetTuristicDecorator.anuleazaRezervare();
        pachetTuristicDecorator.rezervaPachet();
    }
}
