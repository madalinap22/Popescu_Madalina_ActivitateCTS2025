package extra3.SpitalFacadeNew.main;

import extra3.SpitalFacadeNew.model.Facade2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaPaturi = new ArrayList<>();
        listaPaturi.add(1);
        listaPaturi.add(2);

        Facade2 facade2 = new Facade2();
        facade2.internarePacient("Pacient1", 1, listaPaturi, "Medic1");



    }
}
