/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author raik
 */
public class App {
    
    public static void main(String[] args) {
        
        System.out.println(Animal.IS_ALIVE);
        System.out.println(Animal.name());

        System.out.println(Mammal.IS_ALIVE);
        System.out.println(Mammal.NUM_PARENTS);        
        System.out.println(Mammal.name());        
        
        System.out.println(Seal.IS_ALIVE);
        System.out.println(Seal.NUM_PARENTS);        
        System.out.println(Seal.NUM_FEET);

        
        HarbourSeal hs = new HarbourSeal();
        hs.breathing();
        hs.lactating();
        hs.swimming();
        System.out.println(hs.NUM_FEET);
        System.out.println(hs.NUM_PARENTS);
        System.out.println(hs.IS_ALIVE);      
        System.out.println(hs.bodyTemp());              
        System.out.println(hs.bodyTemp("Seal"));                      
        System.out.println(hs.name());                              

    }
    
}
