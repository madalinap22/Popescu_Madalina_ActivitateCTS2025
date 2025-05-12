package Structurale.extra.Decorator4.model;

public class ProdusDecorat extends AProdusDecorator{


    public ProdusDecorat(IProdus produs) {
        super(produs);
    }

    //implementarea FUNCTIONALITATII NOI
    public void adaugaTopping(String topping){
        ((Produs)produs).getListaIngrediente().add(topping);
    }

}
