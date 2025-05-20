package Structurale.extra.FarmacieComposite.model;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiune{
    private String denumire;
    private List<IOptiune> optiuni = new ArrayList<>();

    public Sectiune(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(IOptiune opt) {
        optiuni.add(opt);
    }

    @Override
    public void stergeNod(IOptiune opt) {
        optiuni.remove(opt);
    }

    @Override
    public void getNod(int index) {
        optiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: "+denumire);
        for (var elem:optiuni) {
            elem.descriere();
        }
    }
}
