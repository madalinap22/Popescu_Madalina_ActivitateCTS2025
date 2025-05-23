package extra3.PachetAdapterClase.model;

public class PachetTuristic implements IPachetTuristic{

    private String destinatiePachet;

    public PachetTuristic(String destinatiePachet) {
        this.destinatiePachet = destinatiePachet;
    }

    @Override
    public void descrierePachet() {
        System.out.println("Destinatia pachetului este: " + destinatiePachet);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a rezervat pachetul cu destinatia: " + destinatiePachet);
    }
}
