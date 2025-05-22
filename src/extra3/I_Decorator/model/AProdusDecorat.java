package extra3.I_Decorator.model;

public abstract class AProdusDecorat implements IProdus{
    protected IProdus produs;

    public AProdusDecorat(IProdus produs) {
        this.produs = produs;
    }

    public abstract void alegeTopping(String topping);
}
