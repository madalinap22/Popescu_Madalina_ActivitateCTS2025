package Comportamentale.Template.main;

import Comportamentale.Template.model.APachetTuristic;
import Comportamentale.Template.model.PachetCazare;
import Comportamentale.Template.model.PachetCazareTransport;
import Comportamentale.Template.model.PachetTransport;

public class Main {
    public static void main(String[] args) {

        APachetTuristic p1 = new PachetCazare(1);
        APachetTuristic p2 = new PachetTransport(2);
        APachetTuristic p3 = new PachetCazareTransport(3);

        p1.vindePachet();
        System.out.println("----------------------------");
        p2.vindePachet();
        System.out.println("----------------------------");
        p3.vindePachet();
    }
}
