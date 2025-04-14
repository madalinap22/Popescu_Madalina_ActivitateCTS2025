package Structurale.extra.STBDecorator.main;

import Structurale.extra.STBDecorator.model.Bilet;
import Structurale.extra.STBDecorator.model.BiletDecorat;
import Structurale.extra.STBDecorator.model.BiletDecorator;
import Structurale.extra.STBDecorator.model.IBilet;

public class Main {
    public static void main(String[] args) {

        IBilet bilet = new Bilet(21,400,"20.04.2025");
        BiletDecorator biletDecorator = new BiletDecorat(bilet);
        biletDecorator.printeazaBilet();
        biletDecorator.adaugaMesaj("Mesaj custom");
    }
}
