package com.exam.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Popescu");

        client.plateste(1000.0);

        client.setModPlata(new Card());
        client.plateste(300.0);

        client.setModPlata(new PayPal());
        client.plateste(100.0);
    }
}
