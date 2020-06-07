package com.exam.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetTuristic(200.0);

        ManagerPacheteTuristice managerPacheteTuristice = new ManagerPacheteTuristice();
        System.out.println(pachetTuristic);

        managerPacheteTuristice.adaugaMemento(pachetTuristic.salvareMemento());
        pachetTuristic.setPret(50.0);
        System.out.println(pachetTuristic);

        pachetTuristic.setPret(100.0);
        managerPacheteTuristice.adaugaMemento(pachetTuristic.salvareMemento());
        System.out.println(pachetTuristic);

        pachetTuristic.setPret(1999.0);
        System.out.println(pachetTuristic);

        pachetTuristic.undoToMemento(managerPacheteTuristice.getMemento(0));
        System.out.println(pachetTuristic);
    }
}
