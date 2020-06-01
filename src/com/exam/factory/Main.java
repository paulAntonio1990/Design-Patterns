package com.exam.factory;

import com.sun.org.apache.xml.internal.security.transforms.params.XPathFilterCHGPContainer;

public class Main {
    public static void main(String[] args) {
        AgentieSimpleFactory agentie = new AgentieSimpleFactory();
        PachetTuristic pachetCazare = null;
        PachetTuristic pachetTransport = null;
        try {
            pachetCazare = agentie.create(TipPachet.PACHET_CAZARE);
            pachetTransport = agentie.create(TipPachet.PACHET_TRANSPORT);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pachetCazare.descrie();
        pachetTransport.descrie();

        AgentieSingletonSimpleFactory agentieSingletonSimpleFactory = AgentieSingletonSimpleFactory.getAgentie();
        PachetTuristic pachetCazare2 = null;
        PachetTuristic pachetTransport2 = null;
        try {
            pachetCazare2 = agentie.create(TipPachet.PACHET_CAZARE);
            pachetTransport2 = agentie.create(TipPachet.PACHET_TRANSPORT);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pachetCazare2.descrie();
        pachetTransport2.descrie();
    }
}
