package ro.ase.cts.builder02;

public class Internare02 {
    private String nume;
    private boolean pat_rabatabil;
    private boolean mic_dejun_inclus;
    private boolean papuci_camera;
    private boolean halat;


    public Internare02(String nume, boolean pat_rabatabil, boolean mic_dejun_inclus, boolean papuci_camera, boolean halat) {
        this.nume = nume;
        this.pat_rabatabil = pat_rabatabil;
        this.mic_dejun_inclus = mic_dejun_inclus;
        this.papuci_camera = papuci_camera;
        this.halat = halat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isPat_rabatabil() {
        return pat_rabatabil;
    }

    public void setPat_rabatabil(boolean pat_rabatabil) {
        this.pat_rabatabil = pat_rabatabil;
    }

    public boolean isMic_dejun_inclus() {
        return mic_dejun_inclus;
    }

    public void setMic_dejun_inclus(boolean mic_dejun_inclus) {
        this.mic_dejun_inclus = mic_dejun_inclus;
    }

    public boolean isPapuci_camera() {
        return papuci_camera;
    }

    public void setPapuci_camera(boolean papuci_camera) {
        this.papuci_camera = papuci_camera;
    }

    public boolean isHalat() {
        return halat;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pat_rabatabil=").append(pat_rabatabil);
        sb.append(", mic_dejun_inclus=").append(mic_dejun_inclus);
        sb.append(", papuci_camera=").append(papuci_camera);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
