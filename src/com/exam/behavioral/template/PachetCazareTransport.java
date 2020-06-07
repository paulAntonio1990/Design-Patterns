package com.exam.behavioral.template;

public class PachetCazareTransport extends PachetTuristic {

    public PachetCazareTransport(int cod) {
        super(cod);
    }

    @Override
    public void cautareCazare(int codPachet) {
        System.out.println("S-a gasit cazare pentru pachetul CT cu codul " + codPachet);
    }

    @Override
    public void cautareTransport(int codPachet) {
        System.out.println("S-a gasit transport pentru pachetul CT cu codul" + codPachet);
    }

    @Override
    public void rezervarePachet(int codPachet) {
        System.out.println("Pachetul cu cazare si transport cu codul " + codPachet + " a fost rezervat.");
    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("Pachetul cu cazare si transport cu codul " + codPachet + " a fost rezervat.");
    }
}
