/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author raik
 */
public class OverloadTest1 {
    public static void main(String[] args) {
        
        
        test("test");
        test(5L);
        test(5);        
        test((short)5);                
    }
    
    static void test(String s){ System.out.println("String"); }

//    static void test(long l){ System.out.println("long"); }

    static void test(Object o){ System.out.println("Object"); }    

//    static void test(Long l){ System.out.println("Long"); }    

    static void test(int i){ System.out.println("int"); }    
    static void test(short s){ System.out.println("short"); }        
}
