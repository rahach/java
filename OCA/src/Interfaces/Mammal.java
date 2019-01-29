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
public interface Mammal extends Animal {
    
    int NUM_PARENTS = 2;
    
    void lactating();

    default double bodyTemp(){
        return 20.0;
    };    
    
    static String name(){
        return "Mammal";
    }    
    
}
