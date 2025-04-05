package Structurale.Facade.model;

public class Hotel {
    private String nume;

    private int nrAngajati;
    private boolean allInclusive;

    public Hotel(String nume, int nrAngajati, boolean allInclusive) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.allInclusive = allInclusive;
    }

    public void rezervaCamera(){
        System.out.println("S-a rezervat camera la hotelul "+ nume);
    }
}
