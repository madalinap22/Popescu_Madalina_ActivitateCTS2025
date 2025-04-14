package Structurale.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IOptiune{

    private String denumireCategorie;
    private List<IOptiune> listaOptiuni = new ArrayList<>();

    public Categorie(String denumire) {
        this.denumireCategorie = denumire;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
    listaOptiuni.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        listaOptiuni.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
        listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+ denumireCategorie);
        for (var elem:listaOptiuni) {
            elem.descriere();
        }
    }
}
