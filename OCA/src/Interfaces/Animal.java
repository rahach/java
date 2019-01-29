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
public interface Animal {
    
    String IS_ALIVE = "is alive";
 
    void breathing();

    default double bodyTemp(){
        return 10.0;
    }

    static String name(){
        return "Animal";
    }
    
}
