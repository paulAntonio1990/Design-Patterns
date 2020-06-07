package com.exam.behavioral.template;

public class PachetTransport extends PachetTuristic {

    public PachetTransport(int cod) {
        super(cod);
    }

    @Override
    public void cautareCazare(int codPachet) {

    }

    @Override
    public void cautareTransport(int codPachet) {
        System.out.println("S-a gasit transport pentru pachetul cu codul " + codPachet);
    }

    @Override
    public void rezervarePachet(int codPachet) {
        System.out.println("Pachetul de transport cu codul " + codPachet + " a fost rezervat.");
    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("Pachetul de transport cu codul " + codPachet + " a fost platit.");
    }
}
