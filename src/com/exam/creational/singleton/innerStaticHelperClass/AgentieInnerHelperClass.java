package com.exam.creational.singleton.innerStaticHelperClass;

public class AgentieInnerHelperClass {
    private String name;
    private Double capital;
    private Integer numarAngajati;

    private static class Inner {
        private static AgentieInnerHelperClass singleton = new AgentieInnerHelperClass();
    }

    private AgentieInnerHelperClass() {
        name = "AgentieTest";
        capital = 100.0;
        numarAngajati = 123;
    }

    public static AgentieInnerHelperClass getSingletone() {
        return Inner.singleton;
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
}
