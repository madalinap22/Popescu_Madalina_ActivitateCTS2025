package extra3.SpitalFacadeNew.model;

import java.util.ArrayList;
import java.util.List;

public class Salon2 {

    private List<Integer> listaPaturiLibere = new ArrayList<>();

    public Salon2(List<Integer> listaPaturiLibere) {
        this.listaPaturiLibere = listaPaturiLibere;
    }

    public void verificaDisponibilitateSalon(){

        System.out.println("S-a verificat disponibilitatea in salon si urmatoarele paturi sunt libere: ");
        for (var elem: listaPaturiLibere) {
            System.out.println(elem + " ");
        }

    }



}
