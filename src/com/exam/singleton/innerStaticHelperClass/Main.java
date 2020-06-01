package com.exam.singleton.innerStaticHelperClass;

public class Main {
    public static void main(String[] args) {
        AgentieInnerHelperClass ag1 = AgentieInnerHelperClass.getSingletone();
        AgentieInnerHelperClass ag2 = AgentieInnerHelperClass.getSingletone();

        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
        System.out.println(ag1);
        System.out.println(ag2);
    }
}
