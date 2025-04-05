package Structurale.extra.SpitalFacade.model;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere = new ArrayList<>();

    public Salon(List<Integer> paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public List<Integer> getPaturiLibere() {
        return paturiLibere;
    }

    public void rezervaPat(){
        System.out.println("S-a rezervat un pat");
    }
}
