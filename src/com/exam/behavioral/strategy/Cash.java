package com.exam.behavioral.strategy;

public class Cash implements ModPlata {
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println("Clientul " + numeClient + " plateste cash suma de " + sumaPlatita + " RON.");
    }
}
