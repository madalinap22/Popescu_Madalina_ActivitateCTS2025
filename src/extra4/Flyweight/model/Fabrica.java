package extra4.Flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<Integer, ICont> conturi = new HashMap<>();

    public Fabrica() {
    }

    public ICont getCont(int id, String numeClient, String nrtelefon){
        ICont cont = conturi.get(id);
        if(cont == null){
            cont = new Cont(id, numeClient,nrtelefon);
            conturi.put(id,cont);
        }
        return cont;
    }
}
