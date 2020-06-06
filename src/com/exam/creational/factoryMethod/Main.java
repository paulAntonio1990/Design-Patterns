package com.exam.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factoryAllInclusive = new FactoryAllInclusive();
        PachetTuristic pachetAllInclusive = factoryAllInclusive.createPachetTuristic();

        System.out.println(pachetAllInclusive.getClass());
        pachetAllInclusive.descrie();
    }
}
