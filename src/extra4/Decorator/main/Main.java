package extra4.Decorator.main;

import extra4.Decorator.model.ABiletDecorator;
import extra4.Decorator.model.Bilet;
import extra4.Decorator.model.BiletDecorat;
import extra4.Decorator.model.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Paris");
        bilet.descriereBilet();

        ABiletDecorator bDecorat = new BiletDecorat(bilet);
        bDecorat.printBiletCuMesaj("La multi ani!!!");

    }
}
