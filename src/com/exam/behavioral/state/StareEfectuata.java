package com.exam.behavioral.state;

public class StareEfectuata implements  Stare {
    @Override
    public void doAction(Rezervare rezervate) {
        System.out.println("Rezervarea cu id-ul " + rezervate.getId() + " este trecuta in starea EFECTUATA!");
        rezervate.setStare(this);
    }
}
