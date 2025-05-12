package Comportamentale.Command.model;

public class PachetTransport implements IPachet{
    private int id;
    private String destinatie;

    public PachetTransport(int id, String destinatie) {
        this.id = id;
        this.destinatie = destinatie;
    }

    @Override
    public void rezervare() {
        System.out.println("S-a rezervat pachetul de transport cu destinatia "+destinatie);
    }

    @Override
    public void vanzare() {
        System.out.println("S-a vandut pachetul de Transport  cu destinatia "+destinatie);
    }
}
