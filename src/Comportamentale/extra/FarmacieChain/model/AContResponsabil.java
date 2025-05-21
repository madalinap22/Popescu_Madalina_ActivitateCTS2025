package Comportamentale.extra.FarmacieChain.model;

public abstract class AContResponsabil {

    protected float sumaCurenta;
    protected AContResponsabil urmatorulResponsabil;

    public AContResponsabil(float sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public AContResponsabil getUrmatorulResponsabil() {
        return urmatorulResponsabil;
    }

    public void setUrmatorulResponsabil(AContResponsabil urmatorulResponsabil) {
        this.urmatorulResponsabil = urmatorulResponsabil;
    }

    public abstract void plateste(Client c);

}
