/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphie2;

/**
 *
 * @author raik
 */
class Lemur extends Primate{
    public String className(){
        return "Lemur";
    }    
    

}


public class Primate{
    public String className(){
        return "Primate";
    }    
    
    public static void main(String[] args) {
        Primate p = new Lemur();
        System.out.println(p.className());
    }    
}