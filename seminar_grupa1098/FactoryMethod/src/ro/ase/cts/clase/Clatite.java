package ro.ase.cts.clase;

public class Clatite extends Desert{
    public Clatite(float pret, float gramaj,float calorii) {
        super(pret,gramaj,calorii);
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clatite:").append(super.toString());
        System.out.println(sb);
    }
}
