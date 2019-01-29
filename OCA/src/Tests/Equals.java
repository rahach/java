/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author raik
 */
public class Equals {
    
    int a;
    
    public static void main(String[] args) {
        
        Equals e1 = new Equals();
        
        Equals e2 = new Equals();
        
        if(e1.equals(e2))
            System.out.println("equal");
        else if(!e1.equals(e2))
            System.out.println("not equal");        
        
        Equals e3 = new Equals();
        
        Equals e4 = e3;
        
        e3.a = 0;
        System.out.println(e3.a);                        
        e4.a = 1;        
        
        if(e3.equals(e4))
            System.out.println("equal");
        else if(!e3.equals(e4))
            System.out.println("not equal");        
        System.out.println(e3.a);                
    }
}
