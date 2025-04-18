package Comportamentale.Strategy.model;

public class PayPal implements IModPlata{

    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a platit prin PayPal suma de "+sumaPlatita+" de catre "+nume);
    }

}
