package com.exam.structural.facade;

public class Facade {

    public void rezervaPachetCazareTransport(String orasPlecare, String orasSosire) {
        CompanieAerina companieAerina = new CompanieAerina("MyAirWays");
        Zbor zborDus = companieAerina.rezervaBiletAvion(orasPlecare, orasSosire);
        Zbor zborIntors = companieAerina.rezervaBiletAvion(orasSosire, orasPlecare);

        Hotel hotel = new Hotel("DPHotel");
        System.out.println(zborDus);
        System.out.println(zborIntors);

        hotel.rezervareCamera(orasSosire);
    }

}
