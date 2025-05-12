package Structurale.extra.Composite.model;

import java.util.ArrayList;
import java.util.List;

public class Item implements IOptiune, IProdus{
    private String denumireItem;
    private List<String> ingrediente = new ArrayList<>();
    private float pret;

    public Item(String denumireItem, List<String> ingrediente, float pret) {
        this.denumireItem = denumireItem;
        this.ingrediente = ingrediente;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(IOptiune opt) throws Exception {
        throw new Exception("nod frunza");
    }

    @Override
    public void stergeNod(IOptiune opt) throws Exception {
        throw new Exception("nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("nod frunza");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+denumireItem);
    }

    @Override
    public void getDescriereIngrediente() {
        for (var elem: ingrediente) {
            System.out.println(elem + " ");
        }
    }

    @Override
    public float getPret() {
        return this.pret;
    }
}
