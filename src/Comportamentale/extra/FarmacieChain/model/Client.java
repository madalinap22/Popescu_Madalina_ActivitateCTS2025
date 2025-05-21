package Comportamentale.extra.FarmacieChain.model;

public class Client {
    private String numeClient;
    private float sumaDePlata;

    public Client(String numeClient, float sumaDePlata) {
        this.numeClient = numeClient;
        this.sumaDePlata = sumaDePlata;
    }

    public float getsumaDePlata() {
        return sumaDePlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append('}');
        return sb.toString();
    }



}
