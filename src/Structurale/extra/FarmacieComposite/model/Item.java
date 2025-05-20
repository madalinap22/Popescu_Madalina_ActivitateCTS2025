package Structurale.extra.FarmacieComposite.model;

public class Item implements IOptiune{
    private String denumireItem;

    public Item(String denumireItem) {
        this.denumireItem = denumireItem;
    }

    @Override
    public void adaugaNod(IOptiune opt) {
        System.out.println("Nod frunza");
    }

    @Override
    public void stergeNod(IOptiune opt) {
        System.out.println("Nod frunza");
    }

    @Override
    public void getNod(int index) {
        System.out.println("Nod frunza");
    }

    @Override
    public void descriere() {
        System.out.println("Item: " + denumireItem);
    }
}
