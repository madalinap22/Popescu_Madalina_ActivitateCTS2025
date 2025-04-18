package Structurale.extra.BancaFlyweight.model;

public class Cont implements ICont{

    private int id;
    private String nume;
    private String adresa;
    private String nrTelefon;
    private String mail;

    public Cont(int id, String nume, String adresa, String nrTelefon, String mail) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Optional optional) {
        System.out.println(this.toString() + optional);
    }
}
