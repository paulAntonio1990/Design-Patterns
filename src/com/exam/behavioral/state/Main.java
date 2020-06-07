package com.exam.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(100);

        StareNeplatita neplatita = new StareNeplatita();
        neplatita.doAction(rezervare);

        StareEfectuata efectuata = new StareEfectuata();
        efectuata.doAction(rezervare);

        StarePlatita platita = new StarePlatita();
        platita.doAction(rezervare);
    }
}
