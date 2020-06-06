package com.exam.structural.decorator;

public abstract class OfertaPachetTuristic implements PachetTuristic {

    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();

}
