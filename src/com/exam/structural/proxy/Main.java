package com.exam.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Dorel cioban la oi", 34);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet proxyPachet = new ProxyPachet(persoana);
        proxyPachet.rezervaPachet();
    }
}
