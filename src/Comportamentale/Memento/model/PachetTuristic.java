package Comportamentale.Memento.model;

public class PachetTuristic {
    private float pret;
    private String destinatie;

    public PachetTuristic(float pret, String destinatie) {
        this.pret = pret;
        this.destinatie = destinatie;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("pret=").append(pret);
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //salvarea si revenirea la stare
    //salvare intr-un nou obiect
    public MementoPachetTuristic salvareMemento(){
        return new MementoPachetTuristic(this.getPret());
    }

    public void revenireMemento(MementoPachetTuristic mementoPachetTuristic){
        this.setPret(mementoPachetTuristic.getPret());
    }


}
