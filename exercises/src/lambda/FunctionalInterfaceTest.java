/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author 2923201
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Consumer<String> plain = (s) -> System.out.println(s);
        plain.accept("Hallo Welt");
        
        Consumer<String> html = (s) -> System.out.println("<h1>" + s + "</h1>");
        html.accept("Hallo Welt");
        
        System.out.println("-----------------------------");               
        
        List<String> list = Arrays.asList("Peter", "Bruce", "Clark", "Erwin", "Hans", "Franz", "Anna");
        
        list.forEach(plain);
        list.forEach(html);       
        
        System.out.println("-----------------------------");

        Function<Integer, String> f1 = (z) -> z + "";
        System.out.println(f1.apply(122));

        
        

        
        
    }
}
