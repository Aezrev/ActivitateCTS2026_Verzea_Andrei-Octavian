package main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.Internare02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Main {
    static void main(String[] args) {
        Internare internare1 = new Internare("Verzea",true,true,true,false);
        Internare internare2 = new Internare();
        internare2.setNume("Vladu");
        internare2.setPat_rabatabil(true);
        internare2.setMic_dejun_inclus(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setArePapuci(true).build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        AbstractBuilder02 builder02 = new InternareBuilder02();
        builder02.setMicDejun(true);
        Internare02 internare5 = builder02.build("Georgica");
        Internare02 internare6 = builder02.build("Gigel");

        internare5.setHalat(false);

    }
}
