package com.company;

import java.util.List;

public class DayCare {

    public static void addAnimal(List<Animal> animalList, Animal animalType) {

        animalList.add(animalType);

    }

    public static void displayAnimalList(List<Animal> animalList) {

        for(Animal animal : animalList) {

            System.out.println(animal.getClass().getSimpleName() + "\n" + animal);
        }
    }

    public static void displayAnimalList(List<Animal> animalList, String animalType) {

        for (Animal animal : animalList) {
            if (animal.getClass().getSimpleName().equals(animalType)) {

                System.out.println(animal.getClass().getSimpleName() + "\n" + animal);
            }
        }
    }

    public static void removeAnimal(String animalName, List<Animal> animalList) {

        for (Animal animal : animalList) {

            if (animal.name.equals(animalName)) {

                animalList.remove(animal);

                return;

            }

        }

    }
}
