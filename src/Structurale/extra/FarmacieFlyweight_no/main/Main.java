package Structurale.extra.FarmacieFlyweight_no.main;
//Cu ocazia sărbătorilor de sfârșit de an dirigintele farmaciei
//        dorește ca atunci când este printat bonul de casă să se printeze
//        și o felicitare de La Mulți Ani pentru client.
//        Se dorește adăugarea acestei noi funcționalități pentru clasa BonDeCasa la printare

import Structurale.extra.FarmacieFlyweight_no.model.FabricaFlyweight;
import Structurale.extra.FarmacieFlyweight_no.model.IBonDeCasa;
import Structurale.extra.FarmacieFlyweight_no.model.Optional;

public class Main {
    public static void main(String[] args) {

        FabricaFlyweight fabrica = new FabricaFlyweight();
        Optional opt1 = new Optional("La multi Ani!");
        IBonDeCasa bon1 = fabrica.getBonDeCasa(1,"20.05.2025",230.5f);
        bon1.descriere(opt1);

        IBonDeCasa bon2 = fabrica.getBonDeCasa(2,"18.05.2025",1230.5f);
        bon2.descriere(opt1);

    }
}
