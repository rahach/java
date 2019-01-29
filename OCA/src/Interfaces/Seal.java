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
abstract class Seal implements Mammal{
    
    static final int NUM_FEET;
    
    abstract void swimming();
    
    static { NUM_FEET = 4; }
    
    abstract public double bodyTemp();

    abstract public double bodyTemp(String a);    
    
    abstract public String name();
}
