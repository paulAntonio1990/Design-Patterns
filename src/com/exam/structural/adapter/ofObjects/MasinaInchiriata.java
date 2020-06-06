package com.exam.structural.adapter.ofObjects;

public class MasinaInchiriata {

    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina() {
        System.out.println("You have just rented the car: " + masina);
    }

    @Override
    public String toString() {
        return "MasinaInchiriata{" +
                "masina=" + masina +
                '}';
    }
}
