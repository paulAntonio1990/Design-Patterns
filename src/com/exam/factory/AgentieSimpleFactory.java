package com.exam.factory;

public class AgentieSimpleFactory {

    public PachetTuristic create(TipPachet tipPachet) throws Exception {
        switch (tipPachet) {
            case PACHET_CAZARE:
                return new PachetCazare();
            case PACHET_TRANSPORT:
                return new PachetTransport();
            case PACHET_CAZARE_TRANSPORT:
                return new PachetCazareTransport();
            default:
                throw new Exception("Tipul inserat nu exista!");
        }
    }
}
