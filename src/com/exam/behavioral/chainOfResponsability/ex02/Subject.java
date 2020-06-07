package com.exam.behavioral.chainOfResponsability.ex02;

public interface Subject {
    void trimiteNotificare(String mesaj);
    void adaugaObserver(Observer observer);
    void strgeObserver(Observer observer);
}
