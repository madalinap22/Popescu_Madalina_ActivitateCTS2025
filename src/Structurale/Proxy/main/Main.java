package Structurale.Proxy.main;

import Structurale.Proxy.model.PachetTuristic;
import Structurale.Proxy.model.Persoana;
import Structurale.Proxy.model.Proxy;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Andreea", 30);
        Persoana persoana2 = new Persoana("Mariana", 70);

        PachetTuristic pachetTuristic = new PachetTuristic(persoana);
        PachetTuristic pachetTuristic2 = new PachetTuristic(persoana2);

        //pachetTuristic2.rezervaPachet();

        Proxy proxyPachet = new Proxy(pachetTuristic);
        Proxy proxyPachet2 = new Proxy(pachetTuristic2);
        proxyPachet.rezervaPachet();
        proxyPachet2.rezervaPachet();
    }
}
