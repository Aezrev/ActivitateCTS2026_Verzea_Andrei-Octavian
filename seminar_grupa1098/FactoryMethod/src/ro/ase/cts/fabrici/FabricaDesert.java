package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;

public class FabricaDesert implements AbstractFactory{
    @Override
    public FelMancare getFelMancare(TipMancare tip, float pret, float gramaj) {
        return this.getFelMancare(tip,pret,gramaj);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tip, float pret, float gramaj, float calorii) {
        if(tip== TipDesert.CLATITE){
            return new Clatite(pret,gramaj,calorii);
        }
        if(tip == TipDesert.PAPANASI){
            return new Papanasi(pret,gramaj,calorii);
        }
        return null;
    }
}
