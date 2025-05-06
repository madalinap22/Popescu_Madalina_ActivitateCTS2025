package Comportamentale.Template.model;

public class PachetTransport extends  APachetTuristic{
    public PachetTransport(int cod) {
        super(cod);
    }

    @Override
    public void cautaCazare(int cod) {

    }

    @Override
    public void cautaTransport(int cod) {
        System.out.println("S-a cautat transport pt pachetul: "+cod);
    }

    @Override
    public void rezervaPachet(int cod) {
        System.out.println("S-a rezervat pachetul: "+cod);
    }

    @Override
    public void plateste(int cod) {
        System.out.println("S-a platit pachetul: "+cod);
    }
}
