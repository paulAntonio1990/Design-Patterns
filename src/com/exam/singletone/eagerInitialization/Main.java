package com.exam.singletone.eagerInitialization;

public class Main {

    public static void main(String[] args) {
        AgentieEager ag1 = AgentieEager.getSingletone();
        AgentieEager ag2 = AgentieEager.getSingletone();

        System.out.println(ag1.getNumeAgentie());
        System.out.println(ag2.getNumeAgentie());
        System.out.println(ag1);
        System.out.println(ag2);
    }
}
