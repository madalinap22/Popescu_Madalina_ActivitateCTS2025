package Structurale.AdapterClase.classes.framework;

public class MasinaInchiriata extends Masina{


    public MasinaInchiriata(String model, int km) {
        super(model, km);
    }

    @Override
    public void inchiriazaMasina() {
        System.out.println("S-a inchiriat masina");
    }
}
