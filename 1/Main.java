package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Tiger();
        Animal animal3 = new Rabbit();

        String meat = "Meat";
        String glass = "Glass";
        animal1.voice();
        animal1.eat(meat);
        animal2.voice();
        animal2.eat(glass);
        animal3.voice();
        animal3.eat(glass);
    }
}
