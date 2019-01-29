/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtectedAccessTest2;

import ProtectedAccessTest1.Bird;

/**
 *
 * @author raik
 */
public class Swan extends Bird{

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.floating();
        System.out.println(swan.floats);
        
        Bird bird = new Swan();
        //bird.floating();
        //System.out.println(bird.floats);
    }
        
}
