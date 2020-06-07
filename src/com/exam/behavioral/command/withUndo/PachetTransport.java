package com.exam.behavioral.command.withUndo;

public class PachetTransport implements PachetTuristic {

    private int cod;

    public PachetTransport(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("Pachetul de transport cu codul " + cod + " a fost vandut!");
    }

    @Override
    public void rezerva() {
        System.out.println("Pachetul de transport cu codul " + cod + " a fost rezervat!");
    }

    @Override
    public void anulareVanzare() {
        System.out.println("A fost anulata vanzarea pachetului de transport cu codul " + cod + ". Banii vor fi virati in cont zilele urmatoare.");
    }

    @Override
    public void anulareRezervare() {
        System.out.println("A fost anulata rezervarea pachetului de transport cu codul " + cod + ".");
    }
}
