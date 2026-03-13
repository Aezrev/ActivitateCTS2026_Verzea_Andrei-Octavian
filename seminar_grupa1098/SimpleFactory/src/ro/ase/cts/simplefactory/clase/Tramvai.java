package ro.ase.cts.simplefactory.clase;

public class Tramvai extends MijlocTransport{


    public Tramvai(String nrInmatriculare, int capacitate, int nrLocuri) {
        super(nrInmatriculare, capacitate, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
