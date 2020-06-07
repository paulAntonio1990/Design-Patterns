package com.exam.behavioral.command.regular;

import com.exam.structural.flyweight.Optionale;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(100);

        Operator operator = new Operator();

        Command vanzare = new ComandaVanzare(pachetTuristic);
        Command rezervare = new ComandaRezervare(pachetTuristic);

        operator.invoca(rezervare);
        operator.invoca(vanzare);
    }
}
