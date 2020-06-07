package com.exam.behavioral.chainOfResponsability.ex02;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements Subject {

    private List<Observer> observers;

    public Hotel() {
        observers = new ArrayList<>();
    }


    @Override
    public void trimiteNotificare(String mesaj) {
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        NotificatorSMS notificatorSMS = new NotificatorSMS();
        NotificatorManager notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        for (Observer observer : observers) {
            notificatorSMS.notifica((Client)observer, mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void strgeObserver(Observer observer) {
        observers.remove(observer);
    }
}
