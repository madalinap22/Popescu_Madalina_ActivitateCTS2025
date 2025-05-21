package Structurale.extra.FarmacieDecorator.main;

import Structurale.extra.FarmacieDecorator.model.ABonDeCasaDecorator;
import Structurale.extra.FarmacieDecorator.model.BonDeCasa;
import Structurale.extra.FarmacieDecorator.model.IBonDeCasa;
import Structurale.extra.FarmacieDecorator.model.DecoratorBonDeCasa;

public class Main {
    public static void main(String[] args) {
        IBonDeCasa bon1 = new BonDeCasa("18.03.2025",222.3f);
        bon1.descriere();

        ABonDeCasaDecorator bonDecorat1 = new DecoratorBonDeCasa(bon1);
        bonDecorat1.printBon();
        bonDecorat1.descriere();

    }
}
