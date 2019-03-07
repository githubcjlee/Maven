package com.mycompany.decorator;

public class TomatoSauce extends ToppingDecorater{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Sauce";
    
    
        }
    
    public double getCost(){
        return tempPizza.getCost() + .35;
    
    }

}