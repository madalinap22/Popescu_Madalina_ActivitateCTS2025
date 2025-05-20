package Structurale.extra.FarmacieFlyweight_no.model;

public class BonDeCasa implements IBonDeCasa {
    private int id;
    private String data;
    private float suma;

    public BonDeCasa(int id, String data, float suma) {
        this.id = id;
        this.data = data;
        this.suma = suma;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BonDeCasa{");
        sb.append("id=").append(id);
        sb.append(", data='").append(data).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Optional optional) {
        System.out.println(this.toString() + optional);
    }
}
