package com.exam.creational.builder;


import com.exam.creational.builder.v1.PachetTransport;
import com.exam.creational.builder.v1.PachetTransportBuilder;
import com.exam.creational.builder.v2.PachetTransportBuilderV2;
import com.exam.creational.builder.v2.PachetTransportV2;

public class Main {
    public static void main(String[] args) {
        PachetTransport pachetTransportV1 = new PachetTransportBuilder()
                .setHasAC(true)
                .setHasWifi(true)
                .setHasTV(true)
                .build();

        System.out.println(pachetTransportV1);

        PachetTransportV2 pachetTransportV2 = new PachetTransportBuilderV2()
                .setHasTV(true)
                .setHasAnimals(true)
                .setHasWifi(true)
                .build();
        System.out.println(pachetTransportV2);
    }
}
