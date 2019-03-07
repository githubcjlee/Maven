/* Builder Pattern? Objects built from other objects
* When you want to build an object made up from other objects
* When you want the creation of these parts to be independent of the main object
* Hide the creation of the parts from the client so both aren't dependent
* The builder knows the specifies and nobody else does 
* Good use of abstraction
* UML: Interface --> Builder --> creates a field --> and then a set robot interface which builds the robot
*/ 

package com.mycompany.builder;

public interface RobotPlan{

    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arms);

    public void setRobotLegs(String legs);

}