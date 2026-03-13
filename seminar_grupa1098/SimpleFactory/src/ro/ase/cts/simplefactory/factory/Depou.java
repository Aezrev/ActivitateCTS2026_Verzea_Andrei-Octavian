package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.clase.Autobuz;
import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.clase.Tramvai;
import ro.ase.cts.simplefactory.clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, String nrInmatriculare, int capacitate, int nrLocuri){
        if(tip == Tipuri.AUTOBUZ){
            return new Autobuz(nrInmatriculare,capacitate,nrLocuri);
        }
        if(tip == Tipuri.TRAMVAI){
            return new Tramvai(nrInmatriculare,capacitate,nrLocuri);
        }
        if(tip == Tipuri.TROLEIBUZ){
            return new Troleibuz(nrInmatriculare,capacitate,nrLocuri);
        }
        return null;
    }
}
