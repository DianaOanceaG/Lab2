package com.example.lab2;

import com.example.lab2.Exceptions.ActivityException;
import com.example.lab2.Interface.Activity;
import com.example.lab2.Animal.Cat;
import com.example.lab2.Animal.Dog;
import com.example.lab2.Animal.animal;

/**
 * Created by Diana on 25.10.2014.
 * This is the main class of the project. It is also the entry point of the apllication.
 */
public class Main {
    /**
     * The entry point to the project
     *
     * @param args The arguments to the executable
     * */

     public static void main(String[] args) {
        System.out.println("Hello world! Lab2");

         Activity activeAnimal=new Cat("cat","Siameza","Felix",true);
         animal caine=new Dog("caine","Husky","Rex",false);
         animal pisica=new Cat("cat","Bengaleza","Baron",false);
         Cat mycat=new Cat("cat","Ragamuffin","Catia",true);
         Dog mydog=new Dog("dog","Dalmatian","Rocky",true);

         try {
             System.out.println("Felix\n");
             activeAnimal.eat();
         } catch (ActivityException e) {
             e.printStackTrace();
         }

         try {
             System.out.println("Baron no owner\n");
             ((Activity)pisica).eat();
         } catch (ActivityException e) {
             e.printStackTrace();
         }

         try {
             System.out.println("Rocky\n");
             mydog.eat();
         } catch (ActivityException e) {
             e.printStackTrace();
         }

         try {
             mydog.bark();
         } catch (Exception e) {
             e.printStackTrace();
         }

         mycat.meow();

         if (caine.hasOwner())
             System.out.println(caine.getNume()+" has a owner! ");
         else
             System.out.println(caine.getNume()+" doesn't have a owner! ");

        System.out.println("The answer is "+pisica.CatorDog(mydog.getSpecie()));
        System.out.println("The answer is "+mydog.CatorDog(mydog.getSpecie()));

         if(((Dog)caine).isHusky())
             System.out.println(caine.getNume()+" is a Husky!");
         else
             System.out.println(caine.getNume()+" is not a Husky!");
         //The implementation of setRasa  from the Dog class is called
        caine.setRasa("Bishon");

     }
}
