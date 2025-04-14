package Structurale.Decorator.model;

public class PachetCazare implements PachetTuristic{

    private String destinatie;
    private int pret;
    private boolean allInclusive;

    public PachetCazare(String destinatie, int pret, boolean allInclusive) {
        this.destinatie = destinatie;
        this.pret = pret;
        this.allInclusive = allInclusive;
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetCazare{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", allInclusive=").append(allInclusive);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a rezervat pachetul cu destinatia "+destinatie);
    }
}
