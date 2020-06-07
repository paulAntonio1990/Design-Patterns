package com.exam.behavioral.state;

public class StareNeplatita implements Stare {
    @Override
    public void doAction(Rezervare rezervate) {
        System.out.println("Rezervarea cu id-ul " + rezervate.getId() + " este trecuta in starea NEPLATITA!");
        rezervate.setStare(this);
    }
}
