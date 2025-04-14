package Structurale.extra.STBDecorator.model;

public abstract class BiletDecorator implements IBilet{

    protected IBilet bilet;

    public BiletDecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeazaBilet() {
        bilet.printeazaBilet();
    }

    public abstract void adaugaMesaj(String mesaj);
}
