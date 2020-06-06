package com.exam.creational.builder.v1;

public class PachetTransportBuilder implements Builder {

    private PachetTransport pachetTransport;

    public PachetTransportBuilder() {
        this.pachetTransport = new PachetTransport(false, false, false, false, false);
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }

    public PachetTransportBuilder setHasWifi(boolean hasWifi) {
        pachetTransport.setHasWifi(hasWifi);
        return this;
    }

    public PachetTransportBuilder setHasAnimals(boolean hasAnimals) {
        pachetTransport.setHasAnimals(hasAnimals);
        return this;
    }

    public PachetTransportBuilder setIsSmoker(boolean isSmoker) {
        pachetTransport.setSmoker(isSmoker);
        return this;
    }

    public PachetTransportBuilder setHasAC(boolean hasAC) {
        pachetTransport.setHasAC(hasAC);
        return this;
    }

    public PachetTransportBuilder setHasTV(boolean hasTV) {
        pachetTransport.setHasTV(hasTV);
        return this;
    }
}
