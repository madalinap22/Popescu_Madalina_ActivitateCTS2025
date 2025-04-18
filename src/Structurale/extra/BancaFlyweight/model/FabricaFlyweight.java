package Structurale.extra.BancaFlyweight.model;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private Map<Integer, ICont> conturi = new HashMap<>();

    public FabricaFlyweight() {
    }

    public ICont getCont(int id, String nume, String adresa, String nrTelefon, String mail) {
        ICont cont = conturi.get(id);
        if (cont == null) {
            cont = new Cont(id, nume, adresa, nrTelefon, mail);
            conturi.put(id,cont);
        }
    return cont;
    }
}