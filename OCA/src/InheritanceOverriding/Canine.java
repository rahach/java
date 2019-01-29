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
public class Canine {
    private int age;

    private final int numLegs = 4;
    
    private final int getNumLegs(){
        return numLegs;
    }
    
    public Canine(int age){
        this.age = age;
    }

    private int getAge(){
        return age;
    }
    
    private void incrementAge(int inc) throws Exception{
        age += inc;
    }
    
}
