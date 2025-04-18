package Comportamentale.Strategy.model;

public class Cash implements IModPlata{
    @Override
    public void plateste(String nume, double sumaPlatita) {
        System.out.println("S-a platit cash suma de "+sumaPlatita+" de catre "+nume);
    }
}
