package main;

import clase.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic cazare = agentieFactory.createPachet(TipPachet.cazare);

//        Singleton SimpleFactory

        SingletonFactory singletonFactory = SingletonFactory.getInstanta();
        PachetTuristic transport = singletonFactory.createPachet(TipPachet.transport);
    }
}
