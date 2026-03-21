package ro.ase.cts.clase;

public class Papanasi extends Desert{

    public Papanasi(float pret, float gramaj, float calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afiseaza() {
        StringBuilder sb = new StringBuilder();
        sb.append("Papanasi:").append(super.toString());
        System.out.println(sb);
    }
}
