package com.exam.behavioral.strategy;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println("Clientul " + numeClient + " plateste cu cardul suma de " + sumaPlatita + " RON.");
    }
}
