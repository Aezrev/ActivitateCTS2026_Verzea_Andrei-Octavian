package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements AbstractFactory{

    @Override
    public FelMancare getFelMancare(TipMancare tip, float pret, float gramaj) {
        if(tip == TipSupa.LEGUME){
            return new SupaLegume(pret,gramaj);
        }
        if(tip == TipSupa.CIUPERCI){
            return new SupaCiuperci(pret,gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tip, float pret, float gramaj, float calorii) {
        return this.getFelMancare(tip,pret,gramaj);
    }
}
