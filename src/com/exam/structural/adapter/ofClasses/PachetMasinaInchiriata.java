package com.exam.structural.adapter.ofClasses;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic {

    public PachetMasinaInchiriata(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
