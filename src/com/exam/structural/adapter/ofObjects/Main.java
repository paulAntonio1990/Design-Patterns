package com.exam.structural.adapter.ofObjects;

import com.exam.structural.adapter.ofClasses.Masina;
import com.exam.structural.adapter.ofClasses.MasinaInchiriata;
import com.exam.structural.adapter.ofClasses.PachetCazare;
import com.exam.structural.adapter.ofClasses.PachetMasinaInchiriata;
import com.exam.structural.adapter.ofClasses.PachetTuristic;

public class Main {

    private static void printRezervare(PachetTuristic pachetTuristic) {
        System.out.println("For customer: ");
        pachetTuristic.descriere();
        System.out.println("For operator: ");
        pachetTuristic.rezervaPachet();
    }


    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printRezervare(pachetCazare);

        System.out.println();
        System.out.println("Renting a car");
        System.out.println();
        System.out.println("Using the classical way:");

        Masina masina = new Masina("Opel", 2000.0);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("We do nou use the printing method");
        System.out.println("For clients: ");
        System.out.println(masinaInchiriata);
        System.out.println("For operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Using the adapter");

        Masina masina2 = new Masina("Porsche", 3500.0);

        System.out.println();
        System.out.println("Now the option is created directly with the desired car");
        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(masina2);

        System.out.println();
        System.out.println("Using the printing method");
        printRezervare(pachetMasinaInchiriata);
    }
}
