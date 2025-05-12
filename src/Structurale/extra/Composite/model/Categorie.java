package Structurale.extra.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IOptiune{

    private String denumireCategorie;
    private List<IOptiune> optiuni = new ArrayList<>();

    public Categorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
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
        System.out.println("Categoria: "+denumireCategorie);
        for (var elem:optiuni) {
            elem.descriere();
        }
    }


}
