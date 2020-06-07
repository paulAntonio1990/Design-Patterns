package com.exam.behavioral.command.regular;

public class ComandaVanzare implements Command {

    private PachetTuristic pachetTuristic;

    public ComandaVanzare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.vanzare();
    }
}
