package Comportamentale.State.model;

public class Neplatita implements IStare{

    @Override
    public void executa(Rezervare rez) {
        rez.setStare(this);
        System.out.println("Stare: Neplatita");
    }
}
