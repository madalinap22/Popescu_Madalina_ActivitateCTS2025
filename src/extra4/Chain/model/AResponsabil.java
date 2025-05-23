package extra4.Chain.model;

public abstract class AResponsabil {
    protected AResponsabil urmatorulResponsabil;
    protected float sumaCurenta;


    public AResponsabil(float sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public AResponsabil getUrmatorulResponsabil() {
        return urmatorulResponsabil;
    }

    public void setUrmatorulResponsabil(AResponsabil urmatorulResponsabil) {
        this.urmatorulResponsabil = urmatorulResponsabil;
    }

    public abstract void plateste(Client c);
}
