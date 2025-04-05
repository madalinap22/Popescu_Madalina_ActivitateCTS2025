package Structurale.extra.SpitalFacade.model;

public class Medic {

    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public void confirma(){
        System.out.println("Medicul a confirmat starea pacientului");
    }
}
