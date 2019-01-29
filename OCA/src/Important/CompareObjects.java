/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

/**
 *
 * @author raik
 */
public class CompareObjects {
    public static void main(String[] args) {
        
        String s1 = "a";
        String s2 = "a";
        String s3 = new String("a");
        String s4 = "A";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);        
        System.out.println(s1.equalsIgnoreCase(s4));    
        System.out.println(s1==s4);           
        
        
        Object obj1 = new Object();
        Object obj2 = obj1;
        if( obj1.equals(obj2) ) System.out.println("equals true");
        else  System.out.println("equals false");        
        if( obj1 == obj2 ) System.out.println("== true");
        else  System.out.println("== false");                
    }
}
