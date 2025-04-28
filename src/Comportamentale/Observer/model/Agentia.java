package Comportamentale.Observer.model;


import java.util.ArrayList;
import java.util.List;

//Subiect
public class Agentia implements ISubiect {

    private String nume;
    private int nrAngajati;
    private List<IObserver> listaClienti = new ArrayList<>();

    public Agentia(String nume, int nrAngajati, List<IObserver> listaClienti) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.listaClienti = listaClienti;
    }

    public Agentia(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaObserver(IObserver obs) {
        this.listaClienti.add(obs);
    }

    @Override
    public void stergeObserver(IObserver obs) {
        this.listaClienti.remove(obs);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (var client: listaClienti) {
            client.receptioneazaMesaj(mesaj);
        }
    }

    public void reducePret(){
        trimiteNotificare("Pretul a fost redus");
    }

    public void adaugaOferta(){
        trimiteNotificare("S-a adaugat oferta");
    }
}
