package com.exam.structural.facade;

public class CompanieAerina {

    private String nume;

    public CompanieAerina(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "CompanieAerina{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public Zbor rezervaBiletAvion(String plecare, String sosire) {
        Zbor zbor = new Zbor(this, plecare, sosire);
        return zbor;
    }
}
