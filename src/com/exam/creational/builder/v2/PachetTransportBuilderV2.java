package com.exam.creational.builder.v2;

public class PachetTransportBuilderV2 implements BuilderV2 {

    private boolean hasWifi;
    private boolean hasAnimals;
    private boolean isSmoker;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransportBuilderV2() {
        this.hasWifi = false;
        this.hasAnimals = false;
        this.hasAC = false;
        this.isSmoker = false;
        this.hasTV = false;
    }

    @Override
    public PachetTransportV2 build() {

        return new PachetTransportV2(hasWifi, hasAnimals, isSmoker, hasAC, hasTV);
    }

    public PachetTransportBuilderV2 setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public PachetTransportBuilderV2 setHasAnimals(boolean hasAnimals) {
        this.hasAnimals = hasAnimals;
        return this;
    }

    public PachetTransportBuilderV2 setIsSmoker(boolean isSmoker) {
        this.isSmoker = isSmoker;
        return this;
    }

    public PachetTransportBuilderV2 setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public PachetTransportBuilderV2 setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }
}
