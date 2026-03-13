package ro.ase.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String nrInmatriculare, int capacitate, int nrLocuri) {
        super(nrInmatriculare, capacitate, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
