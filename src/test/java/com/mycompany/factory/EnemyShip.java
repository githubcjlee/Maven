package com.mycompany.factory;

// Factory Pattern - allows you to create objects without specifying the exact class of object that will be created
/* When a method returns one of several possible classes that share a common super class
* Create a new enemy in a game
* Random number generator picks a number assigned to a specific enemy
* The factory returns the enemy associated with that number
* The class is chosen at run time
* When to use Factory Pattern?
* When you don't know ahead of time what class object you need
* When all of the potential classes are in the same subclass hierarchy 
* To centralize class selection code
* When you don't want the user to have to know every subclass
* To encapsulate object creation
*/ 

public abstract class EnemyShip {
	
	private String name;
	private double speed;
	private double directionX;
	private double directionY;
	private double amtDamage;
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public double getDamage() { return amtDamage; }
	public void setDamage(double newDamage) { amtDamage = newDamage; }
	
	public void followHeroShip(){
		
		System.out.println(getName() + " is following the hero");
		
	}
	
	public void displayEnemyShip(){
		
		System.out.println(getName() + " is on the screen");
		
	}
	
	public void enemyShipShoots() {
		
		System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
		
	}
	
}