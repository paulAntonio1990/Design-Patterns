package com.exam.behavioral.template;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(100);
        pachetTuristic.vindePachet();

        PachetTuristic pachetCazareTransport = new PachetCazareTransport(101);
        pachetCazareTransport.vindePachet();
    }
}
