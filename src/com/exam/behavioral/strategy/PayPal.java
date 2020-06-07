package com.exam.behavioral.strategy;

public class PayPal implements ModPlata {
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println("Clientul " + numeClient + " plateste prin PayPal suma de " + sumaPlatita + " RON.");
    }
}
