package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipMancare;

public interface AbstractFactory {
    public FelMancare getFelMancare(TipMancare tip,float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tip,float pret, float gramaj,float calorii);
}
