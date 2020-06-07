package com.exam.structural.flyweight;

public class PachetTuristicImpl implements PachetTuristic {

    private int cod;
    private String hotel;
    private String destinatie;
    private Boolean hasMicDejun;

    public PachetTuristicImpl(int cod, String hotel, String destinatie, Boolean hasMicDejun) {
        this.cod = cod;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.hasMicDejun = hasMicDejun;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public Boolean getHasMicDejun() {
        return hasMicDejun;
    }

    public void setHasMicDejun(Boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    @Override
    public String toString() {
        return "PachetTuristicImpl{" +
                "cod=" + cod +
                ", hotel='" + hotel + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", hasMicDejun=" + hasMicDejun +
                '}';
    }

    @Override
    public void descriePachet(Optionale optionale) {
        System.out.println("Pachetul Turistic cu codul " + cod
        + ", are cazare la hotelul " + hotel
        + ", din orasul " + destinatie
        + (hasMicDejun ? " are " : " nu are ")
        + "mic dejun, " + (optionale.isHasCina() ? " are " : " nu are ")
        + " inclusa cina si are un numar de "
        + optionale.getNumarExcursii() + " excursii optionale.");
    }
}
