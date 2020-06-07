package com.exam.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerPacheteTuristice {

    private List<MementoPachetTuristic> pachetTuristicList;

    public ManagerPacheteTuristice() {
        pachetTuristicList = new ArrayList<>();
    }

    public void adaugaMemento(MementoPachetTuristic mementoPachetTuristic) {
        pachetTuristicList.add(mementoPachetTuristic);
    }

    public MementoPachetTuristic getMemento(int index) {
        return pachetTuristicList.get(index);
    }

    public MementoPachetTuristic getLastMemento() throws Exception {
        if (pachetTuristicList.size() != 0) {
            MementoPachetTuristic mementoPachetTuristic = pachetTuristicList.get(pachetTuristicList.size() - 1);
            pachetTuristicList.remove(mementoPachetTuristic);

            return mementoPachetTuristic;
        } else {
            throw new Exception("Nu exista stari salvate!");
        }
    }

}
