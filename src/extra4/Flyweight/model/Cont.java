package extra4.Flyweight.model;

public class Cont implements ICont{
    private int id;
    private String numeClient;
    private String nrtelefon;

    public Cont(int id, String numeClient, String nrtelefon) {
        this.id = id;
        this.numeClient = numeClient;
        this.nrtelefon = nrtelefon;
    }

    public int getId() {
        return id;
    }


    @Override
    public void afiseazaDateClientDescriere(Optional opt) {
        System.out.println(this.toString() + opt);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("id=").append(id);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", nrtelefon='").append(nrtelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
