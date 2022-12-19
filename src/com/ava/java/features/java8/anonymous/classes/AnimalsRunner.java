package com.ava.java.features.java8.anonymous.classes;

public class AnimalsRunner {

    public static void main(String[] args) {
        Animal dog = new Dog();
        String bark = dog.getAnimalSound();
        dog.printSound();
        System.out.printf("The dog sound is: %s\n", bark);

        Animal cat = new Cat();
        String meow = cat.getAnimalSound();
        cat.printSound();
        System.out.printf("The cat sound is: %s\n", meow);

        //Anonymous class
        Animal cow = new Animal() {

            final String sound = "Moo!";
            @Override
            public String getAnimalSound() {
                return sound;
            }

            @Override
            public void printSound() {
                System.out.println(sound);
            }
        };

        String moo = cow.getAnimalSound();
        cow.printSound();
        System.out.printf("The cow sound is: %s\n", moo);
    }
}
