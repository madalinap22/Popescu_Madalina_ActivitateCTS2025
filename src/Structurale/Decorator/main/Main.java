package Structurale.Decorator.main;

import Structurale.Decorator.model.PachetCazare;
import Structurale.Decorator.model.PachetCazareDecorator;
import Structurale.Decorator.model.PachetTuristic;
import Structurale.Decorator.model.PachetTuristicDecorator;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachet = new PachetCazare("lisabona",4500,true);
        pachet.rezervaPachet();
        PachetTuristicDecorator pachetTuristicDecorator = new PachetCazareDecorator(pachet);
        pachetTuristicDecorator.anuleazaRezervare();
        pachetTuristicDecorator.rezervaPachet();
    }
}
