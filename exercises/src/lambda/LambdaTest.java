/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author 2923201
 */
public class LambdaTest {
    public static void main(String[] args) {
        MyInterface il = () -> System.out.println("Moin!");
        il.machWas();
        
        il = () -> System.out.println("Hallo Welt!");
        il.machWas();        
        
        MyOtherInterface oi1 = (String s1, String s2) -> s1 + ", " + s2;

        System.out.println(oi1.machWasAnderes("a", "b"));
        
    }
}

//SAM: single abstract method
@FunctionalInterface
interface MyInterface{
       
    void machWas();
    
}

//SAM: single abstract method
@FunctionalInterface
interface MyOtherInterface{
       
    String machWasAnderes(String a, String b);
    
}


