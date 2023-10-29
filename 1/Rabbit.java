package com.company;

import java.util.Objects;

public class Rabbit extends Animal {
    void voice() {
        System.out.println("Ya krolik");
    }

    void eat(String food) {
        if (Objects.equals(food, "Glass")) {
            System.out.println("Mne nravitsea " + food);
        } else {
            System.out.println("Mne ne nravitsea " + food);
        }
    }
}
