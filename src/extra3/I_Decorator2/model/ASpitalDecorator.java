package extra3.I_Decorator2.model;

public abstract class ASpitalDecorator implements ISpital{

    protected ISpital spital;

    public ASpitalDecorator(ISpital spital) {
        this.spital = spital;
    }

    public abstract void accesSalonEchipaj(Vizitator vizitator);

    @Override
    public void accesSalon(Vizitator vizitator) {
        this.spital.accesSalon(vizitator);
    }
}
