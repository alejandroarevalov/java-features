package com.ava.java.features.java8.anonymous.classes;

public class Cat implements Animal {

    final String sound = "Meow!";

    @Override
    public String getAnimalSound() {
        return sound;
    }

    @Override
    public void printSound() {
        System.out.println(sound);
    }
}
