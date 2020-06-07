package com.exam.behavioral.state;

public class StarePlatita implements Stare {
    @Override
    public void doAction(Rezervare rezervate) {
        System.out.println("Rezervarea cu id-ul " + rezervate.getId() + " este trecuta in starea PLATITA!");
        rezervate.setStare(this);
    }
}
