package Structurale.extra.SpitalFacade.model;

import java.util.List;

public class Facade {

    public void interneazaPacient(String nume, int gravitate, String numeMedic,
                                  String specializare, List<Integer> lista){
        Pacient pacient = new Pacient(nume, gravitate);
        Medic medic = new Medic(numeMedic, specializare);
        Salon salon = new Salon(lista);
        pacient.verificaGravitate();
        medic.confirma();
        salon.rezervaPat();
    }
}
