/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphie;

/**
 *
 * @author raik
 */
public class Lemur extends Primate implements Appearance {

    public boolean hasTail() {
        return true;
    }

    public String className(){
        return "Lemur";
    }    
    
}
