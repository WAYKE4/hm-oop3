package com.company;

import java.util.Objects;

public class Dog extends Animal {
    void voice() {
        System.out.println("Ya sobaka");
    }

    void eat(String food) {
        if (Objects.equals(food, "Meat")) {
            System.out.println("Mne nravitsea " + food);
        } else {
            System.out.println("Mne ne nravitsea " + food);
        }
    }
}
