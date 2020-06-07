package com.exam.behavioral.observer;

public class ClientFidel implements Observer {

    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(nume + " ai primit mesajul: " + mesaj);
    }
}
