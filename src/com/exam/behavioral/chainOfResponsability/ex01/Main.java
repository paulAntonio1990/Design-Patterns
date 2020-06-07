package com.exam.behavioral.chainOfResponsability.ex01;

public class Main {

    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Ion");

        notificatorSMS.notifica(client, "Mesaj TEST!");

        Client client2 = new Client("Popescu", "0742 111 222", null);
        notificatorSMS.notifica(client2, "Mesaj client 2");
    }
}
