package com.exam.structural.adapter.ofClasses;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("This is a PachetCazare!");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("You have just booked a room!");
    }
}
