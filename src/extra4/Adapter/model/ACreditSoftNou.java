package extra4.Adapter.model;

public abstract class ACreditSoftNou {
    private String nrCreditLeasing;

    public ACreditSoftNou(String nrCreditLeasing) {
        this.nrCreditLeasing = nrCreditLeasing;
    }

    public String getNrCreditLeasing() {
        return nrCreditLeasing;
    }

    public abstract void oferaCreditLeasing();
}
