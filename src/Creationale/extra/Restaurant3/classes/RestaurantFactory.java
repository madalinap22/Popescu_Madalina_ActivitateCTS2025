package Creationale.extra.Restaurant3.classes;

public class RestaurantFactory {

    public ISupa createInstance(TipSupa tip) throws Exception {
        switch (tip){
            case SupaCiuperci : return new SupaCiuperci();
            case SupaLegume: return new SupaLegume();
            case SupaVita: return new SupaVita();
            default: throw new Exception ("Acesta nu este un tip de supa");
        }
    }
}
