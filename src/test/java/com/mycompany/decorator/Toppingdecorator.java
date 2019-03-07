package com.mycompany.decorator;

abstract class ToppingDecorater implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorater(Pizza newPizza){

        tempPizza = newPizza;

    }

    public String getDescription(){
        return tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }
}