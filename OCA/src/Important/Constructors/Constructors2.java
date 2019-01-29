/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Constructors;

/**
 *
 * @author raik
 */
public class Constructors2 {
    public static void main(String[] args) {
//        B b = new C("c");
        new C(4);
//        new A("a");
//        new A();        

    }
}

class A{
  public A() {   System.out.println("A"); } // A1
  public A(String s) { System.out.println("A :"+s);  }  // A2
    public A(int i){    System.out.println("A :"+i);  }  // A3
}

class B extends A{
  public B() {   System.out.println("B"); } // B1    
  public B(String s) {  super(s); System.out.println("B :"+s);  } // B2
    public B(int i){  System.out.println("B :"+i); } // B3
}

class C extends B{
    private C(){ super(); } // C1
    public C(String s){  super(s);  System.out.println("C :"+s);  } // C2
    public C(int i){ super(i 
    ); System.out.println("C :"+i); } // C3
}