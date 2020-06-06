package com.exam.structural.adapter.ofObjects;

public class Masina {

    private String model;
    private Double capacitateCilindrica;

    public Masina(String model, Double capacitateCilindrica) {
        this.model = model;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(Double capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", capacitateCilindrica=" + capacitateCilindrica +
                '}';
    }
}
