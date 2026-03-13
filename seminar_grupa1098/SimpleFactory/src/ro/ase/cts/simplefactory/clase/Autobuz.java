package ro.ase.cts.simplefactory.clase;

public class Autobuz extends MijlocTransport{


    public Autobuz(String nrInmatriculare, int capacitate, int nrLocuri) {
        super(nrInmatriculare, capacitate, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
