package com.exam.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        ClientFidel clientFidel1 = new ClientFidel("Ionescu");
        ClientFidel clientFidel2 = new ClientFidel("Popescu");
        ClientFidel clientFidel3 = new ClientFidel("Georgescu");

        Agentie agentie = new Agentie("My Agency");

        agentie.addObserver(clientFidel1);
        agentie.addObserver(clientFidel2);
        agentie.notificareOfertaNoua();

        agentie.addObserver(clientFidel3);
        agentie.notificareReducerePret();
    }
}
