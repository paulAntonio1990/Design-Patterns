package com.exam.structural.composite;

public class Main {

    public static void main(String[] args) {
        Optiune cFile = new Categorie("File");
        Optiune cCamera = new Categorie("Camere");
        Optiune cOferte = new Categorie("Oferte");

        Optiune iOpen = new Item("Open");
        Optiune iSave = new Item("Save");
        Optiune iVizualizare = new Item("Vizualizare camere");
        Optiune iEditare = new Item("Editare Camere");
        Optiune iOfertaCraciun = new Item("Oferte Craciun");
        Optiune iCreazaOferta = new Item("Creaza oferta");

        try {
            cCamera.adaugaNod(iVizualizare);
            cCamera.adaugaNod(iEditare);

            cOferte.adaugaNod(iCreazaOferta);
            cOferte.adaugaNod(iOfertaCraciun);

            cFile.adaugaNod(iOpen);
            cFile.adaugaNod(iSave);
            cFile.adaugaNod(cCamera);
            cFile.adaugaNod(cOferte);

            cFile.stergeNod(iSave);
            cOferte.adaugaNod(iSave);

            cFile.descriere();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
