/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung;

/**
 *
 * @author 2923201
 */
public class VererbungTest2 {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.wert);
        b.machWas();
        
        
        System.out.println(b.staticWert);        
        b.machWasStatic();
    }
}


class A{
    
    public String wert = "A";
    
    public static String staticWert = "A static";
    
    public void machWas(){
        System.out.println("A machWas: " + wert);
    }
    
    public static void machWasStatic(){
        System.out.println("A machWasStatic");
    }
}


class B extends A{
    public String wert = "B";
    
    public static String staticWert = "B static";    
    
    @Override
    public void machWas(){
        System.out.println("A machWas");
    }
    
    public static void machWasStatic(){
        System.out.println("A machWasStatic");
    }   
     
}