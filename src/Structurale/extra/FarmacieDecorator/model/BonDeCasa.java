package Structurale.extra.FarmacieDecorator.model;

public class BonDeCasa implements IBonDeCasa{

          private String dataBon;
          private float suma;

    public BonDeCasa(String data, float suma) {
        this.dataBon = data;
        this.suma = suma;
    }

    public String getDataBon() {
        return dataBon;
    }

    @Override
    public void descriere() {
        System.out.println("S-a printat bonul cu data: " + dataBon);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BonDeCasa{");
        sb.append("data='").append(dataBon).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
