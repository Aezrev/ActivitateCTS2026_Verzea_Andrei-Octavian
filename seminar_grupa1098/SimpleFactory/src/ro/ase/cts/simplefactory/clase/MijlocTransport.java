package ro.ase.cts.simplefactory.clase;

public abstract class MijlocTransport {
    protected String nrInmatriculare;
    protected int capacitate;
    protected int nrLocuri;

    public MijlocTransport(String nrInmatriculare, int capacitate, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.capacitate = capacitate;
        this.nrLocuri = nrLocuri;
    }

    public void afiseazaDescriere(){

    }

    @Override
    public String toString() {
        StringBuilder builder =new StringBuilder(" Mijloc Transport: ")
                .append(" Numar inmatriculare ").append(this.nrInmatriculare)
                .append(" Capacitate ").append(this.capacitate)
                .append(" Numar locuri ").append(this.nrLocuri);

        return builder.toString();
    }
}
