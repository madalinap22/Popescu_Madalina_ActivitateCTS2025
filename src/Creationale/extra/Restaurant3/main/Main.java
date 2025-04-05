package Creationale.extra.Restaurant3.main;
import Creationale.extra.Restaurant3.classes.*;

public class Main {
    public static void main(String[] args) throws Exception {

        RestaurantFactory factory = new RestaurantFactory();

        ISupa s1 = factory.createInstance(TipSupa.SupaCiuperci);
        s1.descriere();
        ISupa s2 = factory.createInstance(TipSupa.SupaVita);
        s2.descriere();
        ISupa s3 = factory.createInstance(TipSupa.SupaLegume);
        s3.descriere();

    }
}
