/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;
import java.util.*;
import java.util.function.*;
/**
 *
 * @author raik
 */
public class TraditionalSearch {

    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("seagull", true, true));
        
        print(animals, a -> a.canSwim());
        print(animals, a -> a.canHop());        
        
        print(animals, a -> { return !a.canSwim(); });
        print(animals, a -> !a.canHop());    
        
    }
    
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal: animals){
            if(checker.test(animal)){
                System.out.println(animal);
            }
        }
        System.out.println();        
    }
    
}
