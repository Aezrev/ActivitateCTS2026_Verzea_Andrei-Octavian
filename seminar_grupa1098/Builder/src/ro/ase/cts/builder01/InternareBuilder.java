package ro.ase.cts.builder01;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;
    public InternareBuilder(String nume){
        this.internare = new Internare(nume,false,false,false,false);
    }
    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNume(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPat_rabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean papuci) {
        this.internare.setPapuci_camera(papuci);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean micDejun) {
        this.internare.setMic_dejun_inclus(micDejun);
        return this;
    }
}
