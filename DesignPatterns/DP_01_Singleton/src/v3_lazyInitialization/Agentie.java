package v3_lazyInitialization;

public class Agentie {
    private String nume;
    private float capital;
    private int numarAngajati;

    private static Agentie instanta = null;

    private Agentie(String nume, float capital, int numarAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static Agentie getInstanta() {
        return instanta;
    }

    public static void setInstanta(Agentie instanta) {
        Agentie.instanta = instanta;
    }

    public static Agentie getInstance(String nume, float capital, int numarAngajati){
        if(instanta== null){
            instanta = new Agentie(nume,capital,numarAngajati);
        }
        return instanta;
    }
}
