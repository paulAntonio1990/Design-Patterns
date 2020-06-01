package com.exam.singletone.staticblock;

public class AgentieStaticBlock {
    private String name;
    private Double capital;
    private Integer numarAngajati;

    private static AgentieStaticBlock agentie;

    static {
        try {
            agentie = new AgentieStaticBlock("singleAg", 100.0, 100);
        } catch (Exception e) {
            System.out.println("Agentia nu poate fi creata!");
        }
    }

    private AgentieStaticBlock(String name, Double capital, Integer numarAngajati) {
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

    public static AgentieStaticBlock getAgentie() {
        return agentie;
    }

    public static void setAgentie(AgentieStaticBlock agentie) {
        AgentieStaticBlock.agentie = agentie;
    }
}
