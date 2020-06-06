package com.exam.creational.factoryMethod;

public class FactoryCazareTransport implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetCazareTransport();
    }
}
