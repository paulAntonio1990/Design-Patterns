package com.exam.factoryMethod;

public class FactoryAllInclusive implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetAllInclusive();
    }
}
