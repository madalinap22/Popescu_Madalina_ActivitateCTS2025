package Comportamentale.extra.FarmacieStrategy.model;

public class Card implements IModPlata{
    @Override
    public void plateste(String nume, float suma) {
        System.out.println("S-a platit prin CARD suma de " + suma + " de catre " + nume);
    }
}
