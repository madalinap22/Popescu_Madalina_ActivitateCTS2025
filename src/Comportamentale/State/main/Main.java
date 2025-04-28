package Comportamentale.State.main;

import Comportamentale.State.model.*;

public class Main {
    public static void main(String[] args) {

        Rezervare rez = new Rezervare(1,"20.03.2025");
        IStare stare1 = new Efectuata();
        IStare stare2 = new Neplatita();
        IStare stare3 = new Platita();

        //schimbam comportamentul(obiectul) pe baza starii

        stare1.executa(rez);
    }
}
