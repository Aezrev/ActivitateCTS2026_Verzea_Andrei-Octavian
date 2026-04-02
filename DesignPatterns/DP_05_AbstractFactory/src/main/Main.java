package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Factory factory1 = new FactoryCategoria1();
        Factory factory2 = new FactoryCategoria2();

        PachetTransport transport = factory1.createPT();
        PachetCazare cazare = factory2.createPC();

        transport.descriere();
        cazare.descriere();
    }
}
