package com.exam.creational.singleton.eagerInitialization;

public class AgentieEager {
    private String numeAgentie;
    private double capital;
    private int numarAngajati;

    private static final AgentieEager singleton = new AgentieEager("AgerPress", 1000.0, 100);

    private AgentieEager(String numeAgentie, double capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static AgentieEager getSingleton() {
        return singleton;
    }

}
