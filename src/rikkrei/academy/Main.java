package rikkrei.academy;

import rikkrei.academy.animals.Animal;
import rikkrei.academy.animals.Chicken;
import rikkrei.academy.animals.Tiger;
import rikkrei.academy.edible.IEdible;
import rikkrei.academy.fruit.Apple;
import rikkrei.academy.fruit.Fruit;
import rikkrei.academy.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
