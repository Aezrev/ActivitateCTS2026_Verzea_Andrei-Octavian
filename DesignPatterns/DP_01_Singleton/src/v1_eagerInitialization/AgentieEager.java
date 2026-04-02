package v1_eagerInitialization;

public class AgentieEager {
    private String nume;
    private float capital;
    private int numarAngajati;

//    INSTANTA CREEATA LA INCEPUT(EAGER)
    private static final AgentieEager instanta = new AgentieEager();


//    CONSTRUCTOR PRIVAT
    private AgentieEager() {
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

//    METODA STATICA DE ACCES
    public static AgentieEager getAgentie(){ // Nu e nevoie de parametrii
        return instanta;
    }
}
