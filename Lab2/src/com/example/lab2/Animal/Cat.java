package com.example.lab2.Animal;

import com.example.lab2.Exceptions.ActivityException;
import com.example.lab2.Interface.Activity;

/**
 * Created by Diana on 31.10.2014.
 * This is the class for a cat
 */
public class Cat  extends animal implements Activity{


//constructorul care initializeaza pisica conform constructorului clasei abstracte de baza animal


    public Cat(String specie, String rasa, String nume, boolean hasOwner) {
        super(specie, rasa, nume, hasOwner);
    }

    @Override
    public String CatorDog(String specie) {
        if (specie.matches("cat")) {
            return "cat";
        }
        else {
            System.out.println("Maybe it's a dog!");
            return "not a cat";
        }
    }

    @Override
    public void eat() throws ActivityException {
        if (!this.hasOwner)
            throw new ActivityException(this.getNume()+" might not  have what to eat because he doesn't have a owner!");
            System.out.println("He is eating because his owner takes care of him!");
    }

    @Override
    public void bark() {
        if(this.getSpecie().matches("cat"))
            System.out.println("This is a cat and cats don't bark!");
    }

    @Override
    public void meow() {
        if(this.getSpecie().matches("cat"))
            System.out.println("The cat is  meowing !");
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }

}
