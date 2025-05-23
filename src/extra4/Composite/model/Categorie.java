package extra4.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IOptiune{
    private String denumireCategorie;
    List<IOptiune> optiuni = new ArrayList<>();

    public Categorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
    }

    @Override
    public void metodaSpecificaAfiseaza() {
        System.out.println("Categorie: " + denumireCategorie);
        for (var elem:optiuni) {
           elem.metodaSpecificaAfiseaza();
        }
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
}
