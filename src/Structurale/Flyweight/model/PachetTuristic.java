package Structurale.Flyweight.model;

public class PachetTuristic implements  IPachetTuristic{

    //neaparat de luat un atribut de tip id pt map
    private int cod;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int cod, String hotel, String destinatie, boolean micDejun) {
        this.cod = cod;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("cod=").append(cod);
        sb.append(", hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Optional optional) {
        System.out.println(this.toString() + optional);
    }
}
