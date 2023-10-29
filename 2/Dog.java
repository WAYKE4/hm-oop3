package com.company;

import java.util.Objects;

public class Dog extends Animal {

    private Dog()  {

    }

    public static Dog createDog() {
        return new Dog();
    }
    public void voice() {
        System.out.println("Ya sobaka");
    }

    public void eat(String food) {
        if (Objects.equals(food, "Meat")) {
            System.out.println("Mne nravitsea " + food);
        } else {
            System.out.println("Mne ne nravitsea " + food);
        }
    }
 // Dog dog = new Dog();
 // Class<? extends Dog> dogClass = dog.getClass();
 // Method getVoiceMethod = dogClass.getMethod("voice");
 // Object resultValue = getVoiceMethod.invoke(dog);

}





