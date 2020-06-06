package com.exam.structural.adapter.ofObjects;

public class PachetMasinaInchiriata  implements PachetTuristic {

    private MasinaInchiriata masinaInchiriata;

    public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        System.out.println(masinaInchiriata);
    }

    @Override
    public void rezervaPachet() {
        masinaInchiriata.inchiriazaMasina();
    }
}
