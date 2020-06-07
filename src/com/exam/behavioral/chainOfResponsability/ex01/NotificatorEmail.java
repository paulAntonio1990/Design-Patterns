package com.exam.behavioral.chainOfResponsability.ex01;

public class NotificatorEmail extends Notificator {


    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getAdresaMail() != null) {
            System.out.println(client.getNume() + " ai un Email cu mesajul: " + mesaj);
        } else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
