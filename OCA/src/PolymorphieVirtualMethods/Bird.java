/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphieVirtualMethods;

/**
 *
 * @author raik
 */
public class Bird {
    
    public final String get(){
        return "final";
    }
    
    public String getName(){
        return "Unknown";
    }
    
    public void displayInformation(){
        System.out.println("The bird name is " + getName());
    }
}
