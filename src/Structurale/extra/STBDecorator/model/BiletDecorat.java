package Structurale.extra.STBDecorator.model;

public class BiletDecorat extends BiletDecorator{


    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void adaugaMesaj(String mesaj) {
        System.out.println(mesaj);
    }
}
