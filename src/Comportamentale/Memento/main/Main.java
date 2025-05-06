package Comportamentale.Memento.main;

import Comportamentale.Memento.model.ManagerMemento;
import Comportamentale.Memento.model.MementoPachetTuristic;
import Comportamentale.Memento.model.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic p1 = new PachetTuristic(350.2f, "Roma");
        MementoPachetTuristic m1 = p1.salvareMemento();

        PachetTuristic p2 = new PachetTuristic(550.5f, "Lisbon");
        MementoPachetTuristic m2 = p2.salvareMemento();

        PachetTuristic p3 = new PachetTuristic(450.5f, "Iasi");
        MementoPachetTuristic m3 = p3.salvareMemento();

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(m1);
        managerMemento.adaugaMemento(m2);
        managerMemento.adaugaMemento(m3);
        managerMemento.afisare();

        p1.setPret(678);
        MementoPachetTuristic memento4 = p1.salvareMemento();
        managerMemento.adaugaMemento(p1.salvareMemento());
        p1.revenireMemento(m1);
        System.out.println(p1);
        p1.revenireMemento(memento4);
        System.out.println(p1);

    }
}
