package ro.ase.cts.clase;

public class Rezervare implements PrototypeRezervare{
    private String nume;
    private int ora;
    private int ziua;
    private String telefon;

    public Rezervare(String nume, int ora, int ziua, String telefon) {
        if(nume.length()>1){
            this.nume = nume;
        }else{
            this.nume = "Anonim";
        }
        if(ora <23 && ora>9){
            this.ora = ora;
        }else{
            this.ora = 9;
        }
        if(ziua<30){
            this.ziua = ziua;
        }
        if(telefon.length()==10){
            this.telefon = telefon;
        }else{
            this.telefon = "Error";
        }
    }

    private Rezervare() {
    }

    @Override
    public PrototypeRezervare clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.nume = this.nume;
        rezervareNoua.ora = this.ora;
        rezervareNoua.ziua = this.ziua;
        rezervareNoua.telefon = this.telefon;

        return rezervareNoua;
    }
    public PrototypeRezervare clone(int ora) {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.nume = this.nume;
        rezervareNoua.ora = ora;
        rezervareNoua.ziua = this.ziua;
        rezervareNoua.telefon = this.telefon;

        return rezervareNoua;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", ziua=").append(ziua);
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
