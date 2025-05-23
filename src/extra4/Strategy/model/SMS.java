package extra4.Strategy.model;

public class SMS implements IModPlata{
    @Override
    public void plateste(String client, float sumaDePlata) {
        System.out.println("S-a platit PRIN SMS suma de " + sumaDePlata +" de cate: " + client );
    }
}
