package com.exam.structural.flyweight;

import com.exam.structural.composite.Optiune;

public class Main {

    public static void main(String[] args) {
        FabricaPachete fabricaPachete = new FabricaPachete();
        Optionale optionale1 = new Optionale(true,2);
        Optionale optionale2 = new Optionale(false,20);
        Optionale optionale3 = new Optionale(true,22);
        Optionale optionale4 = new Optionale(false,10);
        Optionale optionale5 = new Optionale(true,5);

        PachetTuristicImpl pachet = (PachetTuristicImpl)fabricaPachete.getPachetTuristic(1);
        pachet.descriePachet(optionale1);

        fabricaPachete.getPachetTuristic(2).descriePachet(optionale2);
        optionale2.setNumarExcursii(64);

        fabricaPachete.getPachetTuristic(2).descriePachet(optionale2);
        fabricaPachete.getPachetTuristic(2).descriePachet(optionale3);
        fabricaPachete.getPachetTuristic(1).descriePachet(optionale4);
        fabricaPachete.getPachetTuristic(1).descriePachet(optionale5);

        System.out.println(fabricaPachete.getNumarPachete());

    }

}
