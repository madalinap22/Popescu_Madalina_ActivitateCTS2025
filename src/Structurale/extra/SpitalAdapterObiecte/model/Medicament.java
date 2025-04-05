package Structurale.extra.SpitalAdapterObiecte.model;

public class Medicament implements IMedicament{

    private String denumire;
    private float pret;
    private int gramaj;

    public Medicament(String denumire, float pret, int gramaj) {
        this.denumire = denumire;
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Medicamentul "+ denumire+ "are pretul de " + pret);
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("S-a cumparat medicamentul "+ denumire+"la pretul de "+pret);
    }
}
