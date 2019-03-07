package com.mycompany.prototype;

public class CloneFactory{

    public Animal getClone(Animal animalSample){

        return animalSample.makeCopy();
        
    }
}