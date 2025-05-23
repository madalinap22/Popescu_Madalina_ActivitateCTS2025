package extra4.Decorator.model;

import java.sql.SQLOutput;

public class Bilet implements IBilet{
    private String destinatie;

    public Bilet(String destinatie) {
        this.destinatie = destinatie;
    }

    public String getDestinatie() {
        return destinatie;
    }

    @Override
    public void descriereBilet() {
        System.out.println("Destinatie bilet de calatorie: " + destinatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
