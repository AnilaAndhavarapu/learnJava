package com.learn.java.practice.assignments_Anila.day_4;

import com.learn.java.practice.assignments_Anila.day_4.objects.assign1.*;

import static com.learn.java.practice.utils.Utils.print;

public class Assign1 {

    public static void main(String[] args) {
        //Create an Animal interface
        // it should have two abstract methods speak and walk both should return String values
        //Create two Animal Classes --> Flying Animal and Land Animal implementing Animal interface
        // Flying animal should also have fly method
        // Create a Pingu class extending Land Animal Class and override walk method
        // Create a FlyingPingu Class extending Flying Animal class and override fly method

        Animal pinguObj = getAnimal("flyingPingu");
        print(pinguObj.walk());
        print(pinguObj.speak());

        FlyingPingu obj = new FlyingPingu();
        print("Flying Pingu : " + obj.fly());

        FlyingAnimal obj2 = new FlyingPingu();
        print("Flying Animal : "  + obj2.fly());



    }

    public static Animal getAnimal(String animal) {
        switch(animal) {
            case "landAnimal":
                return new LandAnimal();
            case "flyingAnimal":
                return new FlyingAnimal();
            case "pingu":
                return new LandPingu();
            case "flyingPingu":
                return new FlyingPingu();
            default:
                return null;
        }
    }

}

