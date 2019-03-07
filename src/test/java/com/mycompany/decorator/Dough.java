package com.mycompany.decorator;

public class Dough extends ToppingDecorater{

    public Dough(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Thin Dough");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Thin Dough";
    
    
        }
    
    public double getCost(){
        return tempPizza.getCost() + .00;
    
    }

}