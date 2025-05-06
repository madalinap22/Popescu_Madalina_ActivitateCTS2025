package Structurale.Flyweight.model;

import java.util.HashMap;

public class FabricaFlyweight {

    private HashMap<Integer, IPachetTuristic> pachete = new HashMap<>();

    public FabricaFlyweight() {
    }

    public IPachetTuristic getPachetTuristic(int cod, String hotel, String destinatie, boolean micDejun){
        IPachetTuristic pachetTuristic = pachete.get(cod);
        if (pachetTuristic == null){
            pachetTuristic = new PachetTuristic(cod, hotel, destinatie, micDejun);
            pachete.put(cod, pachetTuristic);
        }
        return pachetTuristic;
    }

}
