package Singleton.SingletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

// 1.Instanta statica de tipul clasei
// 2.Constructorul privat
// 3. Metoda public static getInstance
public class Pachet {
    private String  destinatie;
    private float cost;
    private static Map<String,Pachet> mapPachete = new HashMap<>();


    private Pachet(String destinatie, float cost) {
        this.destinatie = destinatie;
        this.cost = cost;
    }

    public static synchronized Pachet getInstance(String d,float c){
        if(!mapPachete.containsKey(d)){
            Pachet pachet = new Pachet(d,c);
            mapPachete.put(d,pachet);
        }
        {
            return mapPachete.get(d);
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("destinatie='").append(destinatie).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
