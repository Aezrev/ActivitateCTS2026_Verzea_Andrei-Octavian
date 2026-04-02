package main;

import clase.PachetTuristic;
import factory.*;

public class Main {
    public static void main(String[] args) {
        PachetTuristicFactory factory = new CazareFactory();
        PachetTuristicFactory factoryTransport = new TransportFactory();

        PachetTuristic autobuz = factoryTransport.create(TipPachetTransport.TransportAutobuz);
        PachetTuristic cabana = factory.create(TipPachetCazare.CazareCabana);
    }
}
