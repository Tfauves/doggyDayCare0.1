package com.company;

//Cat Class Child class of Animal,
//        Field requirements: Pattern, wasStray
//        include 1 field of your own creation,
//        Constructor that takes at least the required fields and satisfies the parent constructor.
//        Override speak Class

public class Cat extends Animal {

    public String pattern;
    public boolean wasStray;
    public boolean isMean;

    public Cat(int legs, String size, boolean isFixed, String name, int age, String pattern, boolean wasStray, boolean isMean) {

        super(legs, size, isFixed, name, age);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isMean = isMean;
    }

    public static void speak() {
        System.out.println("Meow");
    }

    public String toString() {

        return String.format("{legs: %s, size: %s, isFixed: %s, name: %s, age: %s, pattern: %s, wasStray: %s, isMean: %s}",legs, size, isFixed, name, age, pattern, wasStray, isMean);
    }
}
