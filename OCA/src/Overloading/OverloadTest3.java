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
public class OverloadTest3 {
    
    public static void main(String[] args) {
        test(4);        
        test(4L);                

    }
    static void test(Long L){ System.out.println("Long"); }    
    static void test(Long... L){ System.out.println("Long..."); }            
    static void test(Object O){ System.out.println("Object"); }    
}
