/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author raik
 */
public class BooleanTest {

    //bool b = null;
    //boolean b = 1;
    boolean b1 = true|false;
    boolean b3 = (10<11);
    boolean b2 = true||false;
    
    public static void main(String[] args) {
        BooleanTest bt = new BooleanTest();
        
        System.out.println(bt.b1);
        System.out.println(bt.b2);      
        System.out.println(bt.b3);              
    }
    
    
}
