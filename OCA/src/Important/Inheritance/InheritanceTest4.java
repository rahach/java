/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Inheritance;

/**
 *
 * @author raik
 */
public class InheritanceTest4 {
   public static void main(String[] args){
      A a1 = new A(); 
      B b1 = new B();     
      a1 = (A) b1;        
      
      A a2 = new A();
      B b2 = new B();      
      b2 = (B) a2;
   }
}

class A {  }

class B extends A {  }
