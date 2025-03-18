package Prototype.classes;

import java.util.ArrayList;
import java.util.List;

//Spitalul are în dotare și un laborator în care mai mulți chimiști
// produc diferite rețete pentru medicamente. În momentul în care o rețetă este produsă
// trebuie ținut cont de cantitățile din soluțiile care sunt folosite.
// Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor
// medicamente fără a se trece prin procesul de creare al rețetei. Să se implementeze modulul
// care facilitează crearea de noi obiecte de rețete fără a fi nevoie de apelul constructorului.
public class Reteta implements IReteta{

    private String denumire;
    private List<String> listaIngrediente = new ArrayList<>();

    public Reteta(String denumire, List<String> listaIngrediente) {
        this.denumire = denumire;
        this.listaIngrediente = listaIngrediente;
    }

    public Reteta() {
    }


    @Override
    public IReteta clone() {
        IReteta clona = new Reteta();
        ((Reteta)clona).denumire = this.denumire;
        ((Reteta)clona).listaIngrediente = new ArrayList<>();
        for(int i=0; i<this.listaIngrediente.size(); i++){
            ((Reteta)clona).listaIngrediente.add(this.listaIngrediente.get(i));
        }
        return clona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", listaIngrediente=").append(listaIngrediente);
        sb.append('}');
        return sb.toString();
    }
}
