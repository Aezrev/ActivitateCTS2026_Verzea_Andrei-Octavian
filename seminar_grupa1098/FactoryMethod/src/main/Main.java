package main;


import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI,100,400,300);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.CIUPERCI,100,400,400);

        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI,100,200,1000);
        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE,100,300,1100);

        supaCiuperci.afiseaza();
        supaLegume.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();
    }
}