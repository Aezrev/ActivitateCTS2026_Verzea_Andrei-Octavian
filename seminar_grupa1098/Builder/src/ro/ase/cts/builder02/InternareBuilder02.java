package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean pat_rabatabil;
    private boolean mic_dejun_inclus;
    private boolean papuci_camera;
    private boolean halat;

    public InternareBuilder02() {
        this.pat_rabatabil = false;
        this.mic_dejun_inclus = false;
        this.papuci_camera = false;
        this.halat = false;
    }

    @Override
    public Internare02 build(String nume) {
        return new Internare02(nume,pat_rabatabil,papuci_camera,halat,mic_dejun_inclus);
    }


    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.pat_rabatabil=patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean papuci) {
        this.papuci_camera = papuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejun(boolean micDejun) {
        this.mic_dejun_inclus = micDejun;
        return this;
    }
}
