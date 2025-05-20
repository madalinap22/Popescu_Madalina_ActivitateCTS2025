package Structurale.extra.FarmacieDecorator.model;

public abstract class ABonDeCasaDecorator implements IBonDeCasa{
    protected IBonDeCasa bon;

    public ABonDeCasaDecorator(IBonDeCasa bon) {
        this.bon = bon;
    }
    public abstract void printBon();

    @Override
    public void descriere() {
        this.bon.descriere();
    }
}
