package extra4.Decorator.model;

public abstract class ABiletDecorator implements IBilet{

    protected IBilet bilet;

    public ABiletDecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void descriereBilet() {
        this.bilet.descriereBilet();
    }

    public abstract void printBiletCuMesaj(String mesaj);


}
