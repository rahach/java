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
public class Inheritance2 {

    public static void main(String args[]){
       A a = new A();
       B b = new B();
       a = b;  // 1
//       b = a;  // 2 // compilation error: cast required for narrowing
       a = (B) b; // 3
       b = (B) a; // 4
    }
    
}

class A{ }

class B extends A { }

//Casting a base class to a subclass as in : b = (B) a; is also called as narrowing (as you are trying to 
//narrow the base class object to a more specific class object) and needs explicit cast.
//Casting a sub class to a base class as in: A a = b; is also called as widening and does not need any casting.

//For example, consider two classes: Automobile and Car, where Car extends Automobile
//Now, Automobile a = new Car(); is valid because a car is definitely an Automobile. So it does not need an explicit cast.

//But, Car c = a; is not valid because 'a' is an Automobile and it may be a Car, a Truck, or a MotorCycle, so the 
//programmer has to explicitly let the compiler know that at runtime 'a' will point to an object of class Car. Therefore, the programmer must use an explicit cast:
//Car c = (Car) a;