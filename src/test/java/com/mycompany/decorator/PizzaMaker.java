package com.mycompany.decorator;

public class PizzaMaker{

    public static void main(String[] args){

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new Dough(new PlainPizza())));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Cost: " + basicPizza.getCost());
    }
}