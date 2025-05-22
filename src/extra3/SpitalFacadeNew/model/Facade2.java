package extra3.SpitalFacadeNew.model;

import java.util.List;

public class Facade2 {
    public void internarePacient(String numeP, int gravitate,
                                 List<Integer> listaPaturi, String numeMedic){
        Pacient2 pac1 = new Pacient2(numeP, gravitate);
        Salon2 sal1 = new Salon2(listaPaturi);
        Medic2 med1 = new Medic2(numeMedic);

        pac1.verificaGravitateStare();
        sal1.verificaDisponibilitateSalon();
        med1.verificareConfirmareMedic();
    }
}
