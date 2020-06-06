package com.exam.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {

    private List<Optiune> optiuneList;
    private String nume;

    public Categorie(String nume) {
        optiuneList = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + nume);
        for(Optiune optiune : optiuneList) {
            optiune.descriere();
        }
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        optiuneList.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        optiuneList.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        return optiuneList.get(index);
    }
}
