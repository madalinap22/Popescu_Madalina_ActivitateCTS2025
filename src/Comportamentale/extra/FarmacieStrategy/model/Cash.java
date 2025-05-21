package Comportamentale.extra.FarmacieStrategy.model;

public class Cash implements IModPlata{
    @Override
    public void plateste(String nume, float suma) {
        System.out.println("S-a platit CASH suma de " + suma + " de catre " + nume);
    }
}
