package com.exam.creational.singleton.enumSingleton;

public enum AgentieEnum {
    singleton;

    private String name;
    private Double capital;
    private Integer numarAngajati;

    AgentieEnum() {
        this.name = "AgentieEnum";
        this.capital = 100.0;
        this.numarAngajati = 123;
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
