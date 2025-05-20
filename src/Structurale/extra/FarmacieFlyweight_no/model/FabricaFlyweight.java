package Structurale.extra.FarmacieFlyweight_no.model;

import java.util.HashMap;

public class FabricaFlyweight {
    private HashMap<Integer, IBonDeCasa> bonuri = new HashMap<>();

    public FabricaFlyweight() {
    }

    public IBonDeCasa getBonDeCasa(int id, String data, float suma){
        IBonDeCasa bon = bonuri.get(id);
        if(bon == null){
            bon = new BonDeCasa(id, data, suma);
            bonuri.put(id, bon);
        }
        return bon;
    }


}
