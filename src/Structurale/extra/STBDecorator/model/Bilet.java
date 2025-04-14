package Structurale.extra.STBDecorator.model;

public class Bilet implements IBilet{

    private int id;
    private int pretBilet;
    private String dataEmitere;

    public Bilet(int id, int pretBilet, String dataEmitere) {
        this.id = id;
        this.pretBilet = pretBilet;
        this.dataEmitere = dataEmitere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("id=").append(id);
        sb.append(", pretBilet=").append(pretBilet);
        sb.append(", dataEmitere='").append(dataEmitere).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaBilet() {
        System.out.println("S-a printat biletul cu id-ul "+ id);
    }
}
