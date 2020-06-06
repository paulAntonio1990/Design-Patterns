package com.exam.creational.builder.v1;

public class PachetTransport {
    private boolean hasWifi;
    private boolean hasAnimals;
    private boolean isSmoker;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransport(boolean hasWifi, boolean hasAnimals, boolean isSmoker, boolean hasAC, boolean hasTV) {
        this.hasWifi = hasWifi;
        this.hasAnimals = hasAnimals;
        this.isSmoker = isSmoker;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasAnimals() {
        return hasAnimals;
    }

    public void setHasAnimals(boolean hasAnimals) {
        this.hasAnimals = hasAnimals;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    public boolean isHasAC(boolean b) {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "hasWifi=" + hasWifi +
                ", hasAnimals=" + hasAnimals +
                ", isSmoker=" + isSmoker +
                ", hasAC=" + hasAC +
                ", hasTV=" + hasTV +
                '}';
    }
}
