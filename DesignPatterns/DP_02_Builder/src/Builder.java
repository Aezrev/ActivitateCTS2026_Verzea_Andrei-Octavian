interface IBuilder{
    Class build();
}
class Class{
    private int atribute;

    public int getAtribute() {
        return atribute;
    }

    public void setAtribute(int atribute) {
        this.atribute = atribute;
    }
}
public class Builder implements IBuilder{
    Class clasa;

    public Builder() {
        clasa = new Class();
    }
    public Builder setAtribute(int atribute) {
        this.clasa.setAtribute(atribute);
        return this;
    }

    @Override
    public Class build() {
        return clasa;
    }


    public static void main(String[] args) {
        Class clasa = new Builder().setAtribute(2).build();
    }
}
