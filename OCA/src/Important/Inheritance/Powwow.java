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

interface Pow{


    static String str = "Pow str";

    String str2 = "Pow str2";    
    
    static void wow(){ 
        System.out.println("In Pow.wow");    
    }
    
    default void wow2(){
        System.out.println("In Pow.wow2");            
    }
    
    void wow3();
    
}

abstract class Wow{
   
   static void wow(){
       System.out.println("In Wow.wow");    
  }    
   
  public void wow3(){
      System.out.println("Wow wow3");
  } 
   
}

public class Powwow extends Wow implements Pow {

    public void wow3(){
        System.out.println("Powwow wow3");
    }     

    public static void main(String[] args) {
      
        
        Powwow f = new Powwow();
        f.wow();        
        Pow.wow();

        Pow p = f;
        p.wow2();

        p.wow3();        
 
        Wow w = new Powwow();
        ((Wow)w).wow3();
        
        System.out.println(Pow.str);
        System.out.println(p.str);        
        
        System.out.println(Pow.str2);
        System.out.println(p.str2);                
    }
}