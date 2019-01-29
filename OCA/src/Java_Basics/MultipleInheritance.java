/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Basics;

/**
 *
 * @author raik
 */
public class MultipleInheritance {
    
}


// Multiple Inheritance
// Ability to inherit instance methods from multiple classes is called multiple inheritance of implementation. 
// Default methods introduce one form of multiple inheritance of implementation. 
// A class can implement more than one interface, which can contain default methods that have the same name. 
// However, such a class cannot be compiled. In this case, the implementing class is required to provide its own implementation of the common method to avoid ambiguity.

// Java supports multiple inheritance of types. 
// Interfaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces. 

// Java does not support multiple inheritance of state
// Multiple inheritance of state includes ability to inherit instance fields from multiple classes
// Since a class is allowed to extend only from one class at the most, it can inherit only one state. 
// Only a class can have instance fields and therefore, only a class can have a state. 
// Fields defined in an interface are always implicitly static, even if you don't specify the keyword static explicitly. 
// Therefore, an interface does not have any state.



