package Structurale.extra.Decorator4.model;

public abstract class AProdusDecorator implements IProdus{
    protected IProdus produs;


    public AProdusDecorator(IProdus produs) {
        this.produs = produs;
    }

    @Override
    public void getDescriereIngrediente() {
        this.produs.getDescriereIngrediente();
    }

    @Override
    public float getPret() {
        return this.produs.getPret();
    }

    //de pastrat aici si vechea functionalitate
    //metoda initiala
    public void comandaProdusBaza(){
        ((Produs)produs).comandaProdusBaza();
    }

    //plus noua functionaliate
    public abstract void adaugaTopping(String topping);
}
