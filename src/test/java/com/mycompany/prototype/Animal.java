package com.mycompany.prototype; 

// Prototype Pattern?
/* Creating new objects(instances) by cloning(copying) other objects
* allows for adding of any subclass instance of a known super class at run time
* Use when there are numerous potential classes that you want to ONLY use if needed at runtime
* Benefits = Reduces the need for creating subclasses
*/

// UML - Client --> PrototypeFactory --> Prototype<interface> casted as animal (Sheep(subclass) & (Dog(subclass))

public interface Animal extends Cloneable { // telling java that it is ok to copy this
    // those copies are gonna be stored in different locations of memory

    public Animal makeCopy();
}