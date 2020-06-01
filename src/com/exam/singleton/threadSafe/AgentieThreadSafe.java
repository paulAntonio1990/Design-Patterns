package com.exam.singleton.threadSafe;

public class AgentieThreadSafe {
    private String name;
    private Double capital;
    private Integer numarAngajati;

    private static AgentieThreadSafe singleton;

    private AgentieThreadSafe(String name, Double capital, Integer numarAngajati) {
        this.name = name;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Integer getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(Integer numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static synchronized AgentieThreadSafe getSingletone(String name, Double capital, Integer numarAngajati) {
        if (singleton == null) {
            singleton = new AgentieThreadSafe(name, capital, numarAngajati);
        }
        return singleton;
    }

}
