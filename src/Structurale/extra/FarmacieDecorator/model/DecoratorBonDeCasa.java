package Structurale.extra.FarmacieDecorator.model;

import Structurale.extra.FarmacieDecorator.model.ABonDeCasaDecorator;
import Structurale.extra.FarmacieDecorator.model.BonDeCasa;
import Structurale.extra.FarmacieDecorator.model.IBonDeCasa;

public class DecoratorBonDeCasa extends ABonDeCasaDecorator {

    public DecoratorBonDeCasa(IBonDeCasa bon) {
        super(bon);
    }

    @Override
    public void printBon() {
        System.out.println("S-a printat bonul cu mesajul La multi ani! pentru bonul cu data: "
                + ((BonDeCasa)bon).getDataBon());
    }
}
