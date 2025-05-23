package extra4.Strategy.model;

public class Card implements IModPlata{
    @Override
    public void plateste(String client, float sumaDePlata) {
        System.out.println("S-a platit PRIN CARD suma de " + sumaDePlata +" de cate: " + client );
    }
}
