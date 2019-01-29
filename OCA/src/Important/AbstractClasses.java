/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

/**
 *
 * @author raik
 */
public class AbstractClasses {
    final public static void main(String[] args) {
        
        LivingThing lt1 = new Animal();
        lt1.reproduce();
        
        LivingThing lt2 = new Plant();
        lt2.reproduce();
        
    }
}

abstract class LivingThing{    
    abstract void reproduce();    
}

class Plant extends LivingThing{   
    void reproduce(){ System.out.println("Plant"); }    
}

class Animal extends LivingThing{
    void reproduce(){ System.out.println("Animal"); }    
}

//This kind of scenario where the subclass HAS the behavior of the base class but implements 
//it in a different way is called as overriding. Here, both Plant and Animal reproduce, 
//so they have the behavior of the base class but they do it differently, so you have to override 
//the base class method in their code. Inheritance is always involved in overriding.

//Overloading is quite different, when you want to do similar (not same) things but 
//the inputs are different then you overload a method. For example, you may have two add methods:
//add(int i1, int i2) and add(ComplexNo c1, ComplexNo c2). Here both are doing similar 
//things (that is why both are named as add) but inputs are different. Both are two entirely 
//different methods and there is no inheritance involved.