package com.ava.java.features.java8.anonymous.classes;

public class Dog implements Animal {

    final String sound = "Woof!";

    @Override
    public String getAnimalSound() {
        return sound;
    }

    @Override
    public void printSound() {
        System.out.println(sound);
    }
}
