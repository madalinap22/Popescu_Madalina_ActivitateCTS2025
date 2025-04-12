package Structurale.extra.AgentieAdapterObiecte.main;

import Structurale.extra.AgentieAdapterObiecte.model.Adapter;
import Structurale.extra.AgentieAdapterObiecte.model.MasinaInchiriata;

public class Main {
    public static void main(String[] args) {

        MasinaInchiriata masina1 = new MasinaInchiriata("Audi", 100000);
        masina1.masinaInchiriata();

        Adapter adapter = new Adapter( masina1);
        adapter.descriere();

    }
}
