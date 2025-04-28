package Comportamentale.Template.model;

public class PachetCazare extends  APachetTuristic{
    public PachetCazare(int cod) {
        super(cod);
    }

    @Override
    public void cautaCazare(int cod) {
        System.out.println("S-a cautat cazare pt pachetul: "+cod);
    }

    @Override
    public void cautaTransport(int cod) {

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
