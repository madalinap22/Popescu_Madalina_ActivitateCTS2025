package extra3.I_Decorator.model;

public class DecoratorProdus extends AProdusDecorat{
    public DecoratorProdus(IProdus produs) {
        super(produs);
    }

    @Override
    public void alegeTopping(String topping) {
        ((Produs)produs).getIngrediente().add(topping);
    }

    @Override
    public void getDescriereIngrediente() {
    produs.getDescriereIngrediente();
    }

    @Override
    public float getPret() {
        return produs.getPret();
    }
}
