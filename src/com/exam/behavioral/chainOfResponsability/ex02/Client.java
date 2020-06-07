package com.exam.behavioral.chainOfResponsability.ex02;

public class Client implements Observer{
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public Client(String nume) {
        this.nume = nume;
        nrTelefon = null;
        adresaMail = null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }

    @Override
    public void primesteSMS(String sms) {
        System.out.println(nume + " ai primit un SMS cu mesajul: " + sms + ".");
    }

    @Override
    public void primesteEmail(String email) {
        System.out.println(nume + " ai primit un email cu mesajul: " + email + ".");
    }
}
