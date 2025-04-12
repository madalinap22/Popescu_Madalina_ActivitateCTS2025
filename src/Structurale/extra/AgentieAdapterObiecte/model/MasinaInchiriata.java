package Structurale.extra.AgentieAdapterObiecte.model;

import java.sql.SQLOutput;

public class MasinaInchiriata extends Masina{

    public MasinaInchiriata(String model, int km) {
        super(model, km);
    }

    @Override
    public void masinaInchiriata() {
        System.out.println("S-a inchiriat masina cu modelul " + getModel()+ " avand "+getKm()+" km");
    }
}
