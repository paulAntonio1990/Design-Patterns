package com.exam.structural.facade;

import java.util.SplittableRandom;

public class Zbor {

    private CompanieAerina companieAerina;
    private String plecare;
    private String sosire;

    public Zbor(CompanieAerina companieAerina, String plecare, String sosire) {
        this.companieAerina = companieAerina;
        this.plecare = plecare;
        this.sosire = sosire;
    }

    public CompanieAerina getCompanieAerina() {
        return companieAerina;
    }

    public void setCompanieAerina(CompanieAerina companieAerina) {
        this.companieAerina = companieAerina;
    }

    public String getPlecare() {
        return plecare;
    }

    public void setPlecare(String plecare) {
        this.plecare = plecare;
    }

    public String getSosire() {
        return sosire;
    }

    public void setSosire(String sosire) {
        this.sosire = sosire;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "companieAerina=" + companieAerina +
                ", plecare='" + plecare + '\'' +
                ", sosire='" + sosire + '\'' +
                '}';
    }
}
