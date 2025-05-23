package extra4.Decorator.model;

import Structurale.extra.FarmacieDecorator.model.BonDeCasa;

public class BiletDecorat extends ABiletDecorator {
    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printBiletCuMesaj(String mesaj) {
        System.out.println("S-a printat bonul cu mesajul" + mesaj + " pentru bonul cu data: "
                + ((Bilet) bilet).getDestinatie());
    }

}
