/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author 2923201
 */
public class GenericTest {
    public static void main(String[] args) {
        Box<String> b = new Box();
        b.put("Hamburg");       
        System.out.println(b.get());
        System.out.println(b.get().getClass().getSimpleName());
        Box<Integer> c = new Box();        
        System.out.println("-----------------------------");                
        c.put(1);       
        System.out.println(c.get());
        System.out.println(c.get().getClass().getSimpleName());
        Box<Double> a = new Box();                
        System.out.println("-----------------------------");                
        a.put(6.44);       
        System.out.println(a.get());        
        System.out.println(a.get().getClass().getSimpleName());        

        System.out.println("-----------------------------");        
        
        System.out.println(machWas(1234));

        System.out.println("-----------------------------");        
        
        BiFunction<Integer, Integer, String> f2 = (z1, z2) -> z1 + "..." + z2;
        System.out.println(f2.apply(0, 100));

        System.out.println("-----------------------------");
        
        Supplier<Integer> dice = () -> new Random().nextInt(6) + 1;
        System.out.println(dice.get());
    
        System.out.println("-----------------------------");
        
        Predicate<String> pred = (s) -> s.startsWith("H");
        System.out.println(pred.test("Peter"));        
        
        System.out.println("-----------------------------");        

        Predicate<String> pred2 = (s) -> s.startsWith("P");        
        Consumer<String> plain = (s) -> System.out.println(s);
        
        List<String> list = Arrays.asList("Peter", "Bruce", "Clark", "Erwin", "Hans", "Franz", "Anna");        
        list.stream()
            .filter(pred2)
            .forEach(plain);
        
    }
    
    static <T> T machWas(T t){
        return t;
    }
    
}

class Box<T>{
    
    private T element;
    
    void put(T e){
        element = e;
    }
    
    T get(){
        return element;
    }
}