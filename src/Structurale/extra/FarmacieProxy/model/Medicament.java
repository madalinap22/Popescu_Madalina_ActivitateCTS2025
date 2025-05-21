package Structurale.extra.FarmacieProxy.model;

public class Medicament implements IMedicament{
    private Client client;

    public Medicament(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void descriere() {
        System.out.println(client.toString());
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("S-a achizitionat medicamentul de catre: "+client.getNumeClient());
    }
}
