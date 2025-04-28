package Comportamentale.Observer.model;

public class ClientFidel implements IObserver{

    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }


    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("S-a receptionat mesajul: "+ mesaj + " pentru clientul "+nume);
    }
}
