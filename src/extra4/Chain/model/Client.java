package extra4.Chain.model;

public class Client {
    private String numeClient;
    private float sumaRetras;


    public Client(String numeClient, float sumaRetras) {
        this.numeClient = numeClient;
        this.sumaRetras = sumaRetras;
    }

    public float getSumaRetras() {
        return sumaRetras;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
