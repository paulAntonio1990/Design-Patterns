package com.exam.behavioral.command.withUndo;

public class ComandaRezervare implements Command {

    private PachetTuristic pachetTuristic;

    public ComandaRezervare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.rezerva();
    }

    @Override
    public void anuleaza() {
        pachetTuristic.anulareRezervare();
    }
}
