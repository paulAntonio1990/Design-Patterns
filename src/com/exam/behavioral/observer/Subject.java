package com.exam.behavioral.observer;

public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
