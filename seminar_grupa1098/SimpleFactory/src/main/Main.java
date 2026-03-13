package main;

import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.factory.Depou;
import ro.ase.cts.simplefactory.factory.Tipuri;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ,"312GEG",30,20);
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI,"213RBH",60,30);
        MijlocTransport troleibuz = depou.getMijlocTransport(Tipuri.TROLEIBUZ,"645UDJ",30,20);

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleibuz.afiseazaDescriere();
    }
}
