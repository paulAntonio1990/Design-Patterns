package com.exam.creational.singleton.threadSafe;

public class Main {
    public static void main(String[] args) {
        AgentieThreadSafe ag1 = AgentieThreadSafe.getSingletone("Agentie_1", 100.0, 100);
        AgentieThreadSafe ag2 = AgentieThreadSafe.getSingletone("Agentie_2", 200.0, 200);

        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
        System.out.println(ag1);
        System.out.println(ag2);
    }
}
