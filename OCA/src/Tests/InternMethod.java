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
public class InternMethod {

    public static void main(String[] args) {
        
        String duke = new String("duke");
        String duke2 = new String("duke");
        System.out.println(duke == duke2); // The result will be false here
        System.out.println(duke.intern() == duke2.intern()); // The result will be true here        
        
        
    }
    
}
