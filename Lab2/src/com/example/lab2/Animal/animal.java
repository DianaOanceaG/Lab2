package com.example.lab2.Animal;

/**
 * Created by Diana on 31.10.2014.
 * this is the abstract animal class
 */
public abstract class animal {
    //specia animalului
    public String specie;
    //rasa din care provine animalul
    private String rasa;
    //numele sau
    private String nume;
    //parametrul care ne spune daca animalul are sau nu stapan
    public boolean hasOwner;

//constructorul care initializeaza animalul cu rasa si numele date
    //se va preciza inclusiv parametrul hasOwner si specia din care face parte


    protected animal(String specie, String rasa, String nume, boolean hasOwner) {
        this.specie = specie;
        this.rasa = rasa;
        this.nume = nume;
        this.hasOwner = hasOwner;
    }

    /*This method must be overwritten by all the subclasses
            *
            * @param specie  The species of the animal
            * */
    public abstract String CatorDog(String specie);

  //Gets the species of the animal
    //@return  The species of the animal
    public String getSpecie() {
        return specie;
    }
    //Sets the species of the animal
    //@param specie The species of the animal
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    //Gets the breed of the animal
    //@return  The breed of the animal
    public String getRasa() {
        return rasa;
    }
    //Sets the breed of the animal
    //@param rasa The breed of the animal
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    //Gets the name of the animal
    //@return  The name of the animal
    public String getNume() {
        return nume;
    }
        //Sets the name of the animal
        //@param nume The name of the animal
    public void setNume(String nume) {
        this.nume = nume;
    }


    //verific daca are stapan

    public  boolean hasOwner()
    {
         return this.hasOwner;
    }
}
