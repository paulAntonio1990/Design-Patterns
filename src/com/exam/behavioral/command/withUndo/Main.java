package com.exam.behavioral.command.withUndo;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(100);

        Operator operator = new Operator();

        Command vanzare = new ComandaVanzare(pachetTuristic);
        Command rezervare = new ComandaRezervare(pachetTuristic);

        operator.invoca(rezervare);
        operator.invoca(vanzare);

        operator.undo();
        operator.undo();
    }
}
