package com.company;
import java.util.*;

//Warm up review of the previous work with a test on Github. Submit the github link to your repo for this assignment. if you are unable to do that we will review github in class today to make sure everyone is able to submit a github link.
//
//        Today you will create a Doggy Daycare application that can handle both Dogs and Cats . create the following classes:

//        (additional challenge. Create a noise field in either child class, update the speak class. if the animal's noise field has data speak the noise otherwise use the parent speak method, hint: may need a second constructor)

//        DayCare class
//static method addAnimal takes an Animal and an Animal List. The method should add the animal to the list.
//        Static method displayAnimals should take an Animal List and should print out each Animal. (note that this is going to print out Animal details)
//        Update the displayAnimals class where as it iterates through each animal it tests what child class it is and prints differently depending on the Animals child type.
//        Static Method removeAnimal should take a name and an Animal list. The method should go through and find the animal with the same name then remove that animal from the list.
//
//
//        Tips to run this program.
//        You'll instantiate the Animal list in the Main method.
//        when you add an animal you can run the method as addAnimal(animalList, new Dog(...parameters...))

public class Main {

    public static void main(String[] args) {

        List<Animal> attendingAnimals = new ArrayList<>();

        DayCare.addAnimal(attendingAnimals, new Dog(4, "large", true, "Jasper", 10, "Golden Retriever", "med", "low"));
        DayCare.addAnimal(attendingAnimals, new Dog(4, "small", true, "Jolene", 10, "Jack Russell", "med", "high"));
        DayCare.addAnimal(attendingAnimals, new Dog(4, "med", true, "Shorzy", 10, "Pit Bull", "short", "med"));

        DayCare.addAnimal(attendingAnimals, new Cat(4, "med", true, "Tiger", 2, "calico", false, true));
        DayCare.addAnimal(attendingAnimals, new Cat(4, "sm", true, "Goofus", 2, "spotted", false, false));

        DayCare.displayAnimalList(attendingAnimals);
//      DayCare.displayAnimalList(attendingAnimals, "Cat");
//        DayCare.removeAnimal("Tiger", attendingAnimals);
//        DayCare.displayAnimalList(attendingAnimals);

//        Dog.speak();
//        Cat.speak();
//        Animal.speak();



    }



}
