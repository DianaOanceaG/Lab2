package com.example.lab2.Animal;

import com.example.lab2.Exceptions.ActivityException;
import com.example.lab2.Interface.Activity;

/**
 * Created by Diana on 31.10.2014.
 * This is the class for a dog
 */
public class Dog extends  animal implements Activity{

    //constructorul care initializeaza cainele conform constructorului clasei abstracte de baza animal
    public Dog(String specie, String rasa, String nume, boolean hasOwner) {
        super(specie, rasa, nume, hasOwner);
        isHusky();
    }

    @Override
    public String CatorDog(String specie) {
        if (specie.matches("dog")) {
            return "dog";
        }
        else {
            System.out.println("Maybe it's a cat!");
            return "not a dog";
        }
    }

    @Override
    public void eat() throws ActivityException {
        if (!this.hasOwner)
            throw new ActivityException("He might not have what to eat because he doesn't have a owner!");
        System.out.println("He is eating because his owner takes care of him!");
    }

    @Override
    public void meow() {
        if(this.getSpecie().matches("dog"))
            System.out.println("This is a dog and dogs don't meow!");
    }

    @Override
    public void bark() {
        if(this.getSpecie().matches("dog"))
            System.out.println("The dog is barking!");
    }

    @Override
    public void setRasa(String rasa) {
        super.setRasa(rasa);
        if(isHusky())
            System.out.println(this.getNume()+" is a Husky!");
        else
            System.out.println(this.getNume()+" is not a Husky!");
    }

    @Override
    public String getNume() {
        return super.getNume();
    }

    //verifica daca, cainele face parte din rasa Husky
    public boolean isHusky()
    {
        return  this.getRasa().matches("Husky");
    }
}
