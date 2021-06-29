package com.company;

//Animal Class:
//        Field requirements: legs, size, isFixed, name
//        include 1 field of your own creation
//        Construction that takes at least the four required fields and initializes them.
//        A speak method that outputs ("---")

public class Animal {

    public int legs;
    public String size;
    public boolean isFixed;
    public String name;
    public int age;

    public Animal(int legs, String size, boolean isFixed, String name, int age) {

        this.legs = legs;
        this.size = size;
        this.isFixed = isFixed;
        this.name = name;
        this.age = age;

    }

    public static void speak() {
        System.out.println("---");
    }

}
