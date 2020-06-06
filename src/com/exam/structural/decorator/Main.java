package com.exam.structural.decorator;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("This offer cannot be canceled");
        System.out.println();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        ofertaPachetTuristic.descriere();
        System.out.println("This offer can be canceled");
        ofertaPachetTuristic.anulareRezervare();
    }
}
