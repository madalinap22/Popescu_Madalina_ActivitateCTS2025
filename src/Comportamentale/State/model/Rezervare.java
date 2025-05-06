package Comportamentale.State.model;

public class Rezervare {
    private int id;
    private String data;
    private IStare stare;

    public Rezervare(int id, String data) {
        this.id = id;
        this.data = data;
        this.stare = null;
    }

    //setter pt stare + getter
    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }
}
