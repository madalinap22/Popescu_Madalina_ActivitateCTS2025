package Comportamentale.Memento.model;

public class MementoPachetTuristic {
    //salvam pretul; atributul din ceallata clasa
    private float pret;

    public MementoPachetTuristic(float pret) {
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
