package com.exam.singletone.staticblock;

public class Main {
    public static void main(String[] args) {
        AgentieStaticBlock ag1 = AgentieStaticBlock.getAgentie();
        AgentieStaticBlock ag2 = AgentieStaticBlock.getAgentie();

        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
        System.out.println(ag1);
        System.out.println(ag1);
    }
}
