package Creationale.SingletonRegistry2.classes;

//preparate multiple in unic cuptor
public class Preparat {

    private String denumire;
    private int nrMinuteGatire;
    private int gradeGatire;

    public int getGradeGatire() {
        return gradeGatire;
    }

    public Preparat(String denumire, int nrMinuteGatire, int gradeGatire) {
        this.denumire = denumire;
        this.nrMinuteGatire = nrMinuteGatire;
        this.gradeGatire = gradeGatire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nPreparat{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrMinuteGatire=").append(nrMinuteGatire);
        sb.append(", gradeGatire=").append(gradeGatire);
        sb.append('}');
        return sb.toString();
    }

    public int getNrMinuteGatire() {
        return nrMinuteGatire;
    }
}
