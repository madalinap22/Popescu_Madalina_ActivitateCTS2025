package Comportamentale.Strategy.model;

public class Client {

    private String nume;
    private IModPlata modPlata;

    public Client(String nume, IModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void plateste(double suma) {
        modPlata.plateste(this.nume, suma);
    }

}
