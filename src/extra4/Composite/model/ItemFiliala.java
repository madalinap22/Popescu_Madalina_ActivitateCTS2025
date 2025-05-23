package extra4.Composite.model;

public class ItemFiliala implements IOptiune{

    private String denumireItem;

    public ItemFiliala(String denumireItem) {
        this.denumireItem = denumireItem;
    }

    @Override
    public void metodaSpecificaAfiseaza() {
        System.out.println("Filiala: "+denumireItem);
    }

    @Override
    public void adaugaNod(IOptiune opt) {
        System.out.println("Acesta este un nod frunza");
    }

    @Override
    public void stergeNod(IOptiune opt) {
        System.out.println("Acesta este un nod frunza");
    }

    @Override
    public void getNod(int index) {
        System.out.println("Acesta este un nod frunza");
    }
}
