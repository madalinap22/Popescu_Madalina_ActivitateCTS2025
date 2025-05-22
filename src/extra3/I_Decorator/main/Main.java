package extra3.I_Decorator.main;

import Structurale.extra.Decorator4.model.AProdusDecorator;
import Structurale.extra.Decorator4.model.ProdusDecorat;
import extra3.I_Decorator.model.AProdusDecorat;
import extra3.I_Decorator.model.DecoratorProdus;
import extra3.I_Decorator.model.IProdus;
import extra3.I_Decorator.model.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingr = new ArrayList<>();
        ingr.add("oua");
        ingr.add("lapte");
        IProdus p1 = new Produs("Produs 1", ingr, 230.5f);

        AProdusDecorat dec1 = new DecoratorProdus(p1);
        dec1.alegeTopping("Cascaval");
        dec1.getDescriereIngrediente();

    }
}
