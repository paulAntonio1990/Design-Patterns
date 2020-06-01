package com.exam.factoryMethod;

public class FactoryCazare implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetCazare();
    }
}
