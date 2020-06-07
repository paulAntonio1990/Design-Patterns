package com.exam.structural.proxy;

public class ProxyPachet implements PachetTuristic {

    private PachetTransport pachetTransport;

    public ProxyPachet(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public ProxyPachet(Persoana persoana) {
        pachetTransport = new PachetTransport(persoana);
    }

    public PachetTransport getPachetTransport() {
        return pachetTransport;
    }

    public void setPachetTransport(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    @Override
    public void descrie() {
        pachetTransport.descrie();
    }

    @Override
    public void rezervaPachet() {
        if (pachetTransport.getPersoana().getVarsta() >= 65) {
            pachetTransport.rezervaPachet();
        } else {
            System.out.println("Rezervarea nu este permisa, deoarece " + pachetTransport.getPersoana().getNume() +
                    " are doar " + pachetTransport.getPersoana().getVarsta() + " ani.");
        }
    }
}
