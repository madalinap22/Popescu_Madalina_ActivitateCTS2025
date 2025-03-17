package SingletonRegistry2.classes;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor instanta = null;
    private List<Preparat> listaAsteptare = null;

    private Cuptor(){
        this.listaAsteptare = new ArrayList<>();
    }

    public static  Cuptor getInstance(){
    if(instanta == null) {
        instanta = new Cuptor();
    }
    return instanta;
    }

    public void addPreparat(Preparat p){
        if(p!=null){
            this.listaAsteptare.add(p);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("listaAsteptare=").append(listaAsteptare);
        sb.append('}');
        return sb.toString();
    }
}
