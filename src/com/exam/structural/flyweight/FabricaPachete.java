package com.exam.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaPachete {

    private Map<Integer, PachetTuristic> pachetTuristicMap;

    public FabricaPachete() {
        pachetTuristicMap = new HashMap<>();
    }

    public int getNumarPachete() {
        return pachetTuristicMap.size();
    }

    public PachetTuristic getPachetTuristic(int codPachet) {
        PachetTuristic pachet = pachetTuristicMap.get(codPachet);

        if (pachet == null) {
            pachet = new PachetTuristicImpl(codPachet, "Hotel", "My Crib", true);
            pachetTuristicMap.put(codPachet, pachet);
        }

        return pachet;
    }
}
