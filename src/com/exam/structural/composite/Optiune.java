package com.exam.structural.composite;

public interface Optiune {
    void descriere();
    void adaugaNod(Optiune optiune) throws Exception;
    void stergeNod(Optiune optiune) throws Exception;
    Optiune getNod(int index) throws Exception;
}
