package com.exam.singleton.lazyInitialization;

public class AgentieLazy {
    private String name;
    private Double capital;
    private Integer numarAngajati;

    private static AgentieLazy singleton = null;

    private AgentieLazy(String name, Double capital, Integer numarAngajati) {
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

    public static AgentieLazy getSingletone(String name, Double capital, Integer nrAngajati) {
        if (singleton == null) {
            singleton = new AgentieLazy(name, capital, nrAngajati);
            return singleton;
        }
        return singleton;
    }

}
