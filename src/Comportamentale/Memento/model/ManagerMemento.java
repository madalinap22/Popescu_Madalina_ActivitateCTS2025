package Comportamentale.Memento.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<MementoPachetTuristic> listaMemento = new ArrayList<>();

    public void adaugaMemento(MementoPachetTuristic m){
        listaMemento.add(m);
    }
    public void stergeMemento(MementoPachetTuristic m){
        listaMemento.remove(m);
    }

    public void getMemento(int index){
        listaMemento.get(index);
    }
public void afisare(){
    for (var elem: listaMemento) {
        System.out.println(elem.toString());
    }
}



}
