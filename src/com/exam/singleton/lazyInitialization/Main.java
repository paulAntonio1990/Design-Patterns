package com.exam.singleton.lazyInitialization;

public class Main {

    public static void main(String[] args) {
        AgentieLazy ag1 = AgentieLazy.getSingletone("Papa", 1234.5, 100);
        AgentieLazy ag2 = AgentieLazy.getSingletone("Papa2", 1234.54, 101);

        System.out.println(ag1.getName());
        System.out.println(ag2.getName());
    }
}
