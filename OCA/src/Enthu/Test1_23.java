/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;

/**
 *
 * @author raik
 */

class ABCD{
   
    int x = 10;
   
    static int y = 20;
    
    static String test(){
        return "ABCD";
    }
    
    String test2(){
        return "ABCD";
    }    
    
}
class MNOP extends ABCD{
   
    int x = 30;
   
    static int y = 40;
   
    static String test(){
        return "MNOP";
    }    
    
    String test2(){
        return "MNOP";
    }
   
}

public class Test1_23 {
   public static void main(String[] args) {
        System.out.println(new MNOP().x+", "+new MNOP().y);
        
        ABCD x = new MNOP();
        System.out.println("1: " + x.test());
        System.out.println("2: " + x.test2());
        System.out.println("3: " + x.x);
        System.out.println("4: " + x.y);        
        
        
        System.out.println("1: " + new MNOP().test());
        System.out.println("2: " + new MNOP().test2());
        System.out.println("3: " + new MNOP().x);
        System.out.println("4: " + new MNOP().y);                

        System.out.println("1: " + new ABCD().test());
        System.out.println("2: " + new ABCD().test2());
        System.out.println("3: " + new ABCD().x);
        System.out.println("4: " + new ABCD().y);      
        
        System.out.println(Math.round(1.5));
   }
}