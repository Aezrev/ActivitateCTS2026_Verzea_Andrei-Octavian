package ro.ase.cts.zoo.main;

import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;
import ro.ase.cts.zoo.animals.FoodType;
import ro.ase.cts.zoo.animals.Lion;
import ro.ase.cts.zoo.animals.Monkey;
import ro.ase.cts.zoo.animals.Zebra;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Baneasa",new ZooKeeper("Andrei"));
        Lion lion = new Lion("Leu", FoodType.MEAT,5);
        zoo.addAnimals(lion);
        Zebra zebra = new Zebra("Zebra", FoodType.HAY,4,60);
        zoo.addAnimals(zebra);
        Monkey monkey = new Monkey("Marcel", FoodType.BANANA,4);
        zoo.addAnimals(monkey);
        zoo.feedAllAnimals();
    }
}