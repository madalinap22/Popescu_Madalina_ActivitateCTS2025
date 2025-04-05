package Creationale.SingletonRegistry2.classes;

import java.util.ArrayList;
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
        this.listaAsteptare = new ArrayList<>();
    }

    //
    static{
        instante = new HashMap<>();
        instante.put(1, new CuptorMultiplu(1, 200));
        instante.put(2, new CuptorMultiplu(2, 250));
        instante.put(3, new CuptorMultiplu(3, 180));
        instante.put(4, new CuptorMultiplu(4, 280));

    }
    //
    public static CuptorMultiplu getInstance(int id){
        return instante.get(id);
    }


    public int timpAsteptare() {
        int total = 0;
        for (Preparat p: this.listaAsteptare){
            total += p.getNrMinuteGatire();
        }
        return total;
    }

    public static void addPreparat(Preparat p){
        var cuptorGradeMinim = instante.get(1);
        for (var i: instante.values()) {
            if (cuptorGradeMinim.gradeMaxim < i.gradeMaxim){
                cuptorGradeMinim = i;
            }
        }

        var cuptorGatireMinim = instante.get(1);
        for (var i: instante.values()) {
            if (cuptorGatireMinim.timpAsteptare() > i.timpAsteptare()){
                cuptorGatireMinim = i;
            }
            if(p.getGradeGatire() >= cuptorGradeMinim.gradeMaxim){
                cuptorGatireMinim.listaAsteptare.add(p);
            }
        }



    }

    public void afisare(){
        for (var elem : instante.values()) {
            if(elem.listaAsteptare != null){
                System.out.println(elem);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuptorMultiplu{");
        sb.append("listaAsteptare=").append(listaAsteptare);
        sb.append(", gradeMaxim=").append(gradeMaxim);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
