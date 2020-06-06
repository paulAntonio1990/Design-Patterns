package com.exam.creational.factoryMethod;

public class FactoryAllInclusive implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetAllInclusive();
    }
}
