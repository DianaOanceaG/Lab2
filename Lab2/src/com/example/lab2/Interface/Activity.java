package com.example.lab2.Interface;
import com.example.lab2.Exceptions.ActivityException;
/**
 * Created by Diana on 31.10.2014.
 */
public interface Activity {

    //this is the eating method
    public void eat() throws ActivityException;

    //this is the barking method -dogs
    public void bark() ;

    //this is the meowing method -cats
    public void meow();
}
