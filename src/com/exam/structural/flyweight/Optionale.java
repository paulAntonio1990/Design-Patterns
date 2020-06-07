package com.exam.structural.flyweight;

public class Optionale {

    private boolean hasCina;
    private Integer numarExcursii;

    public Optionale(boolean hasCina, Integer numarExcursii) {
        this.hasCina = hasCina;
        this.numarExcursii = numarExcursii;
    }

    public boolean isHasCina() {
        return hasCina;
    }

    public void setHasCina(boolean hasCina) {
        this.hasCina = hasCina;
    }

    public Integer getNumarExcursii() {
        return numarExcursii;
    }

    public void setNumarExcursii(Integer numarExcursii) {
        this.numarExcursii = numarExcursii;
    }
}
