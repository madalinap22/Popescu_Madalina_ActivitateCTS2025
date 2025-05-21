package Structurale.extra.FarmacieProxy.model;

//clasa intermediara
public class Client{
    private String numeClient;
    private boolean areReteta;

    public Client(String numeClient, boolean areReteta) {
        this.numeClient = numeClient;
        this.areReteta = areReteta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", areReteta=").append(areReteta);
        sb.append('}');
        return sb.toString();
    }

}
