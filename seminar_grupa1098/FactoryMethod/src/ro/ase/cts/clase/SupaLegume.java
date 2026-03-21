package ro.ase.cts.clase;

public class SupaLegume extends Supa{


    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de legume:").append(super.toString());
        System.out.println(sb);
    }
}
