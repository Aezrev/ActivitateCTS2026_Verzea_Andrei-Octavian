package ro.ase.cts.zoo.animals;

public class Monkey  extends Animal{


    public Monkey(String name, FoodType food, int age) {
        super(name, food, age);
    }

    @Override
    public void eat(String zookeeper_name) {
        System.out.println(zookeeper_name+" hraneste "+ super.name + " cu " + super.food);
    }
}
