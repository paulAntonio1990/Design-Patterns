package com.exam.singletone.enumSingletone;

public class Main {
    public static void main(String[] args) {
        AgentieEnum ag1 = AgentieEnum.singletone;
        AgentieEnum ag2 = AgentieEnum.singletone;

        System.out.println(ag1.hashCode());
        System.out.println(ag2.hashCode());
        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
    }
}
