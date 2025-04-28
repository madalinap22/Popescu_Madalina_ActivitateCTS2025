package Comportamentale.State.model;

public class Platita implements IStare{
    @Override
    public void executa(Rezervare rez) {
        rez.setStare(this);
        System.out.println("Stare: Platita");
    }
}
