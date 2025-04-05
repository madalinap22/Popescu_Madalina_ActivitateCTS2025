package Structurale.AdapterClase.classes;

public class Pachet implements PachetTuristic{

    private String destinatie;
    private float pret;

    public Pachet(String destinatie, float pret) {
        this.destinatie = destinatie;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public void descriere() {
        System.out.println(" Pachet cu destinatia: "+destinatie);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a rezervat pachetul cu destinatia "+destinatie);
    }
}
