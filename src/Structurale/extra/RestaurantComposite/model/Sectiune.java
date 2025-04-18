package Structurale.extra.RestaurantComposite.model;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiune{

    private String denumireSectiune;
    private List<IOptiune> optiuni = new ArrayList<>(); //contine Item-uri sau alte sectiuni; deci folosim interfata

    public Sectiune(String denumireSectiune) { //doar cu 1 parametru; lista va fi in metoda adaugaNod()
        this.denumireSectiune = denumireSectiune;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        optiuni.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
    optiuni.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
        optiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: "+denumireSectiune);
        for (var elem:optiuni) {
           elem.descriere();
        }
    }
}
