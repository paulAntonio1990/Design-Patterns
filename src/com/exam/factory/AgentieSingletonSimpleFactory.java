package com.exam.factory;

public class AgentieSingletonSimpleFactory {

    private static AgentieSingletonSimpleFactory agentie = null;

    private AgentieSingletonSimpleFactory() {
    }

    public static synchronized AgentieSingletonSimpleFactory getAgentie() {
        if (agentie == null) {
            agentie = new AgentieSingletonSimpleFactory();
        }
        return agentie;
    }

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
