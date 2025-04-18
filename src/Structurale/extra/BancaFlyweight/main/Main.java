package Structurale.extra.BancaFlyweight.main;

import Structurale.extra.BancaFlyweight.model.FabricaFlyweight;
import Structurale.extra.BancaFlyweight.model.ICont;
import Structurale.extra.BancaFlyweight.model.Optional;

public class Main {
    public static void main(String[] args) {

        Optional opt1 = new Optional("ING", "sucursala1", 3000, 123456, 5000);
        Optional opt2 = new Optional("BRD", "sucursala2", 6000, 7895, 51000);

        FabricaFlyweight fabrica = new FabricaFlyweight();

        ICont cont1 = fabrica.getCont(1, "numeClient1", "adresa1","0742567","mail@gmail.com" );

        cont1.descriere(opt1);
        cont1.descriere(opt2);
    }
}
