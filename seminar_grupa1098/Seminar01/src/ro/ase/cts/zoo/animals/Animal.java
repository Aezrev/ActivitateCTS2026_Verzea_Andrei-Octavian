package ro.ase.cts.zoo.animals;

public abstract class Animal {
    protected String name;
    private int age;
    protected FoodType food;

    public Animal(String name, FoodType food, int age) {
        this.name = name;
        this.food = food;
        this.age = age;
    }

    public abstract void eat(String zookeeper_name);


}
