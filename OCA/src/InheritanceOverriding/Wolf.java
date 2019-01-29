/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceOverriding;

/**
 *
 * @author raik
 */
public class Wolf extends Canine{
    
    public final int numLegs = 4;
    
    public final int getNumLegs(){
        return numLegs;
    }
    
    public Wolf(){
        super(7);
    }
    
    public int age;
    
    public int getAge(){
        return age;
    }
    
    public void incrementAge(int inc){
        age += inc;
    }    
    
    
}
