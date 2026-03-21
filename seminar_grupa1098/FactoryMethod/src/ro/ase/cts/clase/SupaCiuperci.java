package ro.ase.cts.clase;

public class SupaCiuperci extends Supa{


    public SupaCiuperci(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci:").append(super.toString());
        System.out.println(sb);
    }
}
