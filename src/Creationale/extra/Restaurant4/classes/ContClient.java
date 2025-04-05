package Creationale.extra.Restaurant4.classes;

import java.util.ArrayList;
import java.util.List;

public class ContClient implements IContClient{

    private String nume;
    private String nrTelefon;
    private List<String> rezervari = new ArrayList<>();

    public ContClient(String nume, String nrTelefon, List<String> rezervari) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.rezervari = rezervari;
    }

    public ContClient() {
    }


    @Override
    public IContClient clone() {
        IContClient clona = new ContClient();
        ((ContClient)clona).nume = this.nume;
        ((ContClient)clona).nrTelefon = this.nrTelefon;

        ((ContClient)clona).rezervari = new ArrayList<>();
        for(int i=0; i<this.rezervari.size(); i++){
            ((ContClient)clona).rezervari.add(this.rezervari.get(i));
        }
        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", rezervari=").append(rezervari);
        sb.append('}');
        return sb.toString();
    }
}


