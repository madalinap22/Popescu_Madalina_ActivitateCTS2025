package Structurale.AdapterClase.classes;

import Structurale.AdapterClase.classes.framework.MasinaInchiriata;

public class PachetMasina extends MasinaInchiriata implements PachetTuristic {

    public PachetMasina(String model, int km) {
        super(model, km);
    }

    @Override
    public void descriere() {
        System.out.println("\"S-a cumparat pachetul");
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }

}
