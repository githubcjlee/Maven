package com.mycompany.app;

/** Observer Pattern
* SDP in which an object called the subject, maintains
* a list of its dependents, called observers, and notifies them automatically
* of any state of changes, usually by calling one of their methods
*/


public interface Observer{

    public void update(double ibmPrice, double aaplPrice, double googPrice);


}