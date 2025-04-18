package Structurale.Proxy.model;

public class PachetTuristic implements IPachetTuristic{

    private Persoana persoana;

    public PachetTuristic(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    @Override
    public void descriere() {
        System.out.println(persoana.toString());
    }

    @Override
    public void rezervaPachet() {
        System.out.println("A fost rezervat pachetul de catre: " + persoana.getNume() + " cu varsta: "+persoana.getVarsta());
    }
}
