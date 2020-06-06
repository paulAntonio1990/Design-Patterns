package com.exam.structural.decorator;

public class OfertaPachetCazare extends OfertaPachetTuristic {

    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea de pacheta fost anulata");
    }
}
