package Comportamentale.extra.FarmacieStrategy.model;

public class Client {
    private String numeClient;
    private IModPlata modPlata;

    public Client(String numeClient, IModPlata modPlata) {
        this.numeClient = numeClient;
        this.modPlata = modPlata;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(float suma){
        modPlata.plateste(this.numeClient,suma);
    }



}
