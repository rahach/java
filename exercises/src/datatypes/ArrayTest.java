/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import java.util.Arrays;
/**
 *
 * @author 2923201
 */
public class ArrayTest {

    ArrayTest(){
        System.out.println("Constructor");
    }
    
    
    public static void main(String[] args) {
        
        
        ArrayTest at = new ArrayTest();
        
        Object o = new int[10];
        System.out.println(o);

        
        Object o2 = 1; // Autoboxing von int zu Integer
        System.out.println(o2);
        
        
        byte b = 10;
        short s = 20;
        b = (byte)(b + b);
        
        System.out.println(b);
        
        
        System.out.println("----------------");
        machWas();
        System.out.println("----------------");
        machWas(10, 15);
        System.out.println("----------------");
        machWas(0, 7, 4, 100);        
        System.out.println("----------------");
        machWas2("a", "b", "c", "d");                
        System.out.println("----------------");
        machWas3("a", "b", "c", "d");                        
    }

    static void machWas(int... zahlen){
        for(int i: zahlen){
            System.out.println(i);
        }
    }

    static void machWas2(String... letters){
        for(String s: letters){
            System.out.println(s);
        }
    }    
    
    static void machWas3(String... letters){
        Arrays.stream(letters).forEach(System.out::println);
    }        
}
