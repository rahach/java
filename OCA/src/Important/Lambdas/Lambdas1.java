/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raik
 */
public class Lambdas1 {

    public static void main(String[] args){
        
        List<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("shark", false, true));
        animals.add(new Animal("mouse", true, false));
        animals.add(new Animal("duck", true, true));
        
        print(animals, a -> a.canHop()); 
        print(animals, a -> a.canSwim());         
    }    
    
    private static void print(List<Animal> animals, checkTrait checker){
        for(Animal animal : animals)
            if(checker.test(animal))
                System.out.println(animal);
    }
    
    
}

class Animal{

    private String name;
    private boolean canHop;    
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        name = speciesName;
        canHop = hopper;    
        canSwim = swimmer;
    }

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return name;
    }
}

interface checkTrait{
    public boolean test(Animal a);
}

class checkHopper implements checkTrait{
    public boolean test(Animal a){
        return a.canHop();
    }
}

class checkSwimmer implements checkTrait{
    public boolean test(Animal a){
        return a.canSwim();
    }
}