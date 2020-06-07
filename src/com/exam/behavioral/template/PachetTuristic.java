package com.exam.behavioral.template;

public abstract class PachetTuristic {

    protected int cod;

    public PachetTuristic(int cod) {
        this.cod = cod;
    }

    public abstract void cautareCazare(int codPachet);
    public abstract void cautareTransport(int codPachet);
    public abstract void rezervarePachet(int codPachet);
    public abstract void platirePachet(int codPachet);

    public final void vindePachet() {
        cautareCazare(cod);
        cautareTransport(cod);
        rezervarePachet(cod);
        platirePachet(cod);
    }
}
