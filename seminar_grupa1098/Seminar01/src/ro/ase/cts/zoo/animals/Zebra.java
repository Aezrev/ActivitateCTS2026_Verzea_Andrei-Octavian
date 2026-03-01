package ro.ase.cts.zoo.animals;

public class Zebra extends Animal{
    private int weigth;

    public Zebra(String name, FoodType food, int age, int weigth) {
        super(name, food, age);
        this.weigth = weigth;
    }

    @Override
    public void eat(String zookeeper_name) {
        System.out.println(zookeeper_name+" hraneste "+ super.name + " cu " + super.food);
    }
}
