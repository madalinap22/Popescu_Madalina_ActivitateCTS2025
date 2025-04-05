package Structurale.extra.SpitalFacade.model;

public class Pacient {
    private String nume;
    private int gravitateStare;

    public Pacient(String nume, int gravitateStare) {
        this.nume = nume;
        this.gravitateStare = gravitateStare;
    }

    public void verificaGravitate(){
        System.out.println("S-a verificat gravitatea pacientului " + nume);
    }
}
