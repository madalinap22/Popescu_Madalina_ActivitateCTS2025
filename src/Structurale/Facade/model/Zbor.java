package Structurale.Facade.model;

public class Zbor {
    private int nrZbor;
    private String destinatie;

    public Zbor(int nrZbor, String destinatie) {
        this.nrZbor = nrZbor;
        this.destinatie = destinatie;
    }

    public void rezervaZbor(){
        System.out.println("S-a rezervat zborul cu destinatia "+ destinatie);
    }
}
