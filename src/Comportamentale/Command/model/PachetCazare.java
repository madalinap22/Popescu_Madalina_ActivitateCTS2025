package Comportamentale.Command.model;

public class PachetCazare implements IPachet{

    private int id;
    private String destinatie;

    public PachetCazare(int id, String destinatie) {
        this.id = id;
        this.destinatie = destinatie;
    }

    @Override
    public void rezervare() {
        System.out.println("S-a rezervat pachetul de cazare cu destinatia "+destinatie);
    }

    @Override
    public void vanzare() {
        System.out.println("S-a vandut pachetul de cazare cu destinatia "+destinatie);
    }
}
