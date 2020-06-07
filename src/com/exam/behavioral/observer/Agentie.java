package com.exam.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {

    private List<Observer> observers;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : observers) {
            observer.receptionareMesaj(numeAgentie + " : " + mesaj);
        }
    }

    public void notificareOfertaNoua() {
        trimiteNotificare("A fost adaugata o noua oferta. Consultati catalogul nostru pentru mai multe detalii.");
    }

    public void notificareReducerePret() {
        trimiteNotificare("Preturile au fost reduse! Consultati catalogul nostru pentru mai multe detalii.");
    }
}
