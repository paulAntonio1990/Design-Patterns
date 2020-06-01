package com.exam.singletone.threadSafe;

public class AgentieThreadSafe {
    private String name;
    private Double capital;
    private Integer numarAngajati;

    private static AgentieThreadSafe singletone;

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
        if (singletone == null) {
            singletone = new AgentieThreadSafe(name, capital, numarAngajati);
        }
        return singletone;
    }

}
