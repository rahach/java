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
public class Peacock extends Bird {
    
    public String getName(){
        return "Peacock";
    }
    
    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}
