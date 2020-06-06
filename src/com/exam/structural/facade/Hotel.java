package com.exam.structural.facade;

public class Hotel {

    private String nume;

    public Hotel(String nume) {
        this.nume = nume;
    }

    public void rezervareCamera(String oras) {
        System.out.println("In hotelul: " + nume + " din orasul " + oras + " a fost rezervata o camera");
    }
}
