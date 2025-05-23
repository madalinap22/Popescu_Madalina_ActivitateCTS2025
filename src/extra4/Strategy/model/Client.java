package extra4.Strategy.model;

public class Client{
    private String numeClient;
    private IModPlata modPlata;

    public Client(String numeClient, IModPlata modPlata) {
        this.numeClient = numeClient;
        this.modPlata = modPlata;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }


   public void plateste(float suma){
        modPlata.plateste(this.numeClient, suma);
   }
}
