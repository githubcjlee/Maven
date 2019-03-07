package com.mycompany.decorator;

public class Mozzarella extends ToppingDecorater{

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Mozzarella");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzarella";
    
    
        }
    
    public double getCost(){
        return tempPizza.getCost() + .50;
    
    }

}