package main;

import v1_Builder.PachetTransport;
import v1_Builder.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {
//        V1
        PachetTransport pachetTransport=new PachetTransportBuilder()
                .setHasAC(true)
                .setHasTV(true)
                .setHasWiFi(true)
                .build();

//        V2
//        PachetTransport pt=new PachetTransport();
//        pt.setHasAC(true);
//        pt.setHasTV(true);


//        V3
//        PachetCalatorie pachetCalatorie = PachetCalatorie.builder()
//                .setHasWiFi(true).setHasAC(true).setHasAnimale(true).build();
    }
}
