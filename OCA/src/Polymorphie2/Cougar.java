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
public class Cougar extends Puma{
    
    public static void main(String[] args) {
                
        Puma puma = new Cougar();
        
        System.out.println(puma.getTailLength());
        
    }

    public int getTailLength(int x){
        return 2;
    }    

}

interface HasTail{
    int getTailLength();
}

abstract class Puma implements HasTail{
    
    public int getTailLength(){
        return 4;
    }        
}