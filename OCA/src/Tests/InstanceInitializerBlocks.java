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
public class InstanceInitializerBlocks {

    private static final int LENGTH = 5;
    
    private int number = 0;

    public InstanceInitializerBlocks() {  

        System.out.println("initializer constr " + number);   //4: 2

        { number =  1; }        
        
    }
    
    public static void main(String[] args) {
        


        System.out.println(LENGTH);
        
        InstanceInitializerBlocks iib = new InstanceInitializerBlocks();      

        { System.out.println("initializer main " + iib.number); }          //5: 1
        
    }
    
    { System.out.println("initializer " + number); }   //2 : 0
    
    { number =  2; }   //
    
    { System.out.println("initializer " + number); }   //3 : 2    

    //0
    //2
    //2
    //1
}