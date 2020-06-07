package com.exam.behavioral.command.regular;

import com.exam.structural.facade.CompanieAerina;

public class ComandaRezervare implements Command {

    private PachetTuristic pachetTuristic;

    public ComandaRezervare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.rezerva();
    }
}
