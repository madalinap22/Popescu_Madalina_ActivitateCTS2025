package Structurale.extra.RestaurantComposite.model;

public class Item implements IOptiune{

    private String denumireItem;

    public Item(String denumireItem) {
        this.denumireItem = denumireItem;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
       throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Acesta este un nod frunza");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+denumireItem);
    }
}
