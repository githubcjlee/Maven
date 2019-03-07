package com.mycompany.decorator;

// Decorator Design Pattern
/* allows to modify an object dynamically
* You would use it when you want the capabilities of inheritance with subclasses, but you need to add functionality
* at run time
* It is more flexible than inheritance 
* Simplifies code because you can add functionality using many simple classes
* Rather than rewrite old code, you can extend with new code
* adding pizza toppings and a description reciept with the cost
* UML - Create a pizza interface(desc/cost) --> concrete class (basic pizza) and save it --> 
* --> toppingdecorator<abstract> which adds toppings (shares relationship witih plainpizza)

*/

public interface Pizza {

    public String getDescription();

    public double getCost();
}