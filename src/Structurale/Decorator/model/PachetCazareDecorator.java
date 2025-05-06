package Structurale.Decorator.model;

public class PachetCazareDecorator extends APachetTuristicDecorator {

    public PachetCazareDecorator(IPachetTuristic pachet) {
        super(pachet);
    }

    @Override
    public void anuleazaRezervare() {
        System.out.println("S-a anulat pachetul cu destinatia: "+((PachetCazare)pachet).getDestinatie());
    }
}
