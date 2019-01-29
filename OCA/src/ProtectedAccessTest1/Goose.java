/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedAccessTest1;

/**
 *
 * @author raik
 */
public class Goose extends Bird{
    public static void main(String[] args) {
        Goose goose1 = new Goose();        
        goose1.floating();        
        System.out.println(goose1.floats);                
        
        Bird bird1 = new Bird();
        bird1.floating();
        System.out.println(bird1.floats);
        
        Bird bird2 = new Goose();
        bird1.floating();
        System.out.println(bird1.floats);        
        

    }
        
}
