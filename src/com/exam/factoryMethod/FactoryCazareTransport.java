package com.exam.factoryMethod;

public class FactoryCazareTransport implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetCazareTransport();
    }
}
