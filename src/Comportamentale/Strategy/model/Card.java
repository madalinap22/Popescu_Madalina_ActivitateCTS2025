package Comportamentale.Strategy.model;

public class Card implements IModPlata{

    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a platit prin card suma de "+sumaPlatita+" de catre "+nume);
    }

}
