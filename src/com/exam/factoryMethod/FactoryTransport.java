package com.exam.factoryMethod;

public class FactoryTransport implements Factory {
    @Override
    public PachetTuristic createPachetTuristic() {
        return new PachetTransport();
    }
}
