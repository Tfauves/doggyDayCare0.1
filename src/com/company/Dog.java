package com.company;

// Dog Class, Child class of Animal,
//        Field requirements: Breed, snoutLength,
//        include 1 field of your own creation.
//        Constructor that takes at least the required fields and satisfies the parent constructor.
//        Override speak class

public class Dog extends Animal {

    public String breed;
    public String snoutLength;
    public String energyLevel;


    public Dog(int legs, String size, boolean isFixed, String name, int age, String breed, String snoutLength, String energyLevel) {

        super(legs, size, isFixed, name, age);

        this.breed = breed;
        this.snoutLength = snoutLength;
        this.energyLevel = energyLevel;
    }
    public static void speak() {

        System.out.println("Ruff");
    }

    public String toString() {

        return String.format("{legs: %s, size: %s, isFixed: %s, name: %s, age: %s, breed: %s, snoutLength: %s, energyLevel: %s}",legs, size, isFixed, name, age, breed, snoutLength, energyLevel);
    }

}
