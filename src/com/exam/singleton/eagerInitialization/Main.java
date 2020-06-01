package com.exam.singleton.eagerInitialization;

public class Main {

    public static void main(String[] args) {
        AgentieEager ag1 = AgentieEager.getSingleton();
        AgentieEager ag2 = AgentieEager.getSingleton();

        System.out.println(ag1.getNumeAgentie());
        System.out.println(ag2.getNumeAgentie());
        System.out.println(ag1);
        System.out.println(ag2);
    }
}
