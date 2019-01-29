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
public class OverloadTest2 {
    public static void main(String[] args) {
        test("test");        
        test("test", "test");                
        test("test", "test", "test");                        
        test('c');                        
    }
    static void test(String s){ System.out.println("String"); }    
    static void test(String s1, String s2){ System.out.println("String, String"); }            
    static void test(String... s1){ System.out.println("String..."); }                
    static void test(Object o){ System.out.println("Object"); }                    
}
