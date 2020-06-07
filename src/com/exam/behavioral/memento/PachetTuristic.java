package com.exam.behavioral.memento;

public class PachetTuristic {

    private Double pret;

    public PachetTuristic(Double pret) {
        this.pret = pret;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "pret=" + pret +
                '}';
    }

    public MementoPachetTuristic salvareMemento() {
        return new MementoPachetTuristic(pret);
    }

    public void undoToMemento(MementoPachetTuristic mementoPachetTuristic) {
        pret = mementoPachetTuristic.getPretPachet();
    }
}
