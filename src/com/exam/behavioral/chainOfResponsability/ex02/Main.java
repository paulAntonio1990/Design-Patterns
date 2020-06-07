package com.exam.behavioral.chainOfResponsability.ex02;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Client client1 = new Client("Ionescu", "0123123123", "ion@escu.com");
        Client client2 = new Client("Tomescu", null, "tom@escu.com");
        Client client3 = new Client("Bibescu", null, null);

        hotel.adaugaObserver(client1);
        hotel.adaugaObserver(client2);
        hotel.adaugaObserver(client3);

        hotel.trimiteNotificare("Astazi, 12.12.2020, nu este apa calda in Hotel!");
    }
}
