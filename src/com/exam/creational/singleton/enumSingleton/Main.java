package com.exam.creational.singleton.enumSingleton;

public class Main {
    public static void main(String[] args) {
        AgentieEnum ag1 = AgentieEnum.singleton;
        AgentieEnum ag2 = AgentieEnum.singleton;

        System.out.println(ag1.hashCode());
        System.out.println(ag2.hashCode());
        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
    }
}
