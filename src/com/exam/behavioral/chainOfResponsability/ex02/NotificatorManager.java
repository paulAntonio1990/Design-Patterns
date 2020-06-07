package com.exam.behavioral.chainOfResponsability.ex02;

import com.exam.behavioral.chainOfResponsability.ex02.Client;

public class NotificatorManager extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule Manager, agentia nu detine date de contact pentru clientul: " + client.getNume());
    }
}
