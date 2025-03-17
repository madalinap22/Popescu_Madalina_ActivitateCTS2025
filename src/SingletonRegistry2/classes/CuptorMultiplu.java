package SingletonRegistry2.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuptorMultiplu {
    private static Map<Integer, CuptorMultiplu> instante;
    private List<Preparat> listaAsteptare = null;
    private int gradeMaxim;
    private int id;

    private CuptorMultiplu(int id, int gradeMaxim) {
        this.id = id;
        this.gradeMaxim = gradeMaxim;
        this.listaAsteptare = listaAsteptare;
    }

    static{
        instante = new HashMap<>();
        instante.put(1, new CuptorMultiplu(1, 200));
        instante.put(2, new CuptorMultiplu(2, 250));
        instante.put(3, new CuptorMultiplu(3, 180));
        instante.put(4, new CuptorMultiplu(4, 280));

    }


    public int timpAsteptare() {
        int total = 0;
        for (Preparat p: this.listaAsteptare){
            total += p.getNrMinuteGatire();
        }
        return total;
    }

    public static void addPreparat(Preparat p){

    }

}
