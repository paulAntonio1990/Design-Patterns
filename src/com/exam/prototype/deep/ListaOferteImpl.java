package com.exam.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListaOferteImpl implements ListaOferte {

    private List<String> oferte;

    public ListaOferteImpl() {
        this.oferte = new ArrayList<>();
    }

    public void setOferte(List<String> oferte) {
        this.oferte = oferte;
    }

    @Override
    public ListaOferte copiaza() {
        ListaOferteImpl listaOferte = new ListaOferteImpl();
        List<String> tempList = new ArrayList<>();

        tempList.addAll(oferte);

        listaOferte.setOferte(tempList);

        return listaOferte;
    }

    @Override
    public String toString() {
        return "ListaOferteImpl{" +
                "oferte=" + oferte +
                '}';
    }

    @Override
    public void initiazaListaOferte() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\My place\\Facultate\\sem 6\\CTS\\DesignPatternsProj\\src\\com\\exam\\prototype\\oferte.txt")));
            String oferta = null;

            while ((oferta = reader.readLine()) != null) {
                oferte.add(oferta);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
