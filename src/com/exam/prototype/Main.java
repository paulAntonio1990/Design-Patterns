package com.exam.prototype;

import com.exam.prototype.deep.ListaOferte;
import com.exam.prototype.deep.ListaOferteImpl;

public class Main {
    public static void main(String[] args) {
        ListaOferte listaOferte = new ListaOferteImpl();
        listaOferte.initiazaListaOferte();

        ListaOferte copyListaOferte = listaOferte.copiaza();

        System.out.println(copyListaOferte.toString());
        System.out.println(listaOferte.toString());
    }
}
