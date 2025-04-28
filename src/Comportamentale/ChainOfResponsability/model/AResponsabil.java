package Comportamentale.ChainOfResponsability.model;

//repr za (Responsabil)
public abstract class AResponsabil {

    protected AResponsabil urmatorulResponsabil;

    //no constructor

    public AResponsabil getUrmatorulResponsabil() {
        return urmatorulResponsabil;
    }

    public void setUrmatorulResponsabil(AResponsabil urmatorulResponsabil) {
        this.urmatorulResponsabil = urmatorulResponsabil;
    }

    public abstract void notifica(Client c, String mesaj);
}
