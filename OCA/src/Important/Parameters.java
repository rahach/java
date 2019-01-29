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
public class Parameters {
    public static void testInts(Integer obj, int var){


        System.out.println(java.lang.System.identityHashCode(obj));                        
//        obj = var++;
//        System.out.println(java.lang.System.identityHashCode(obj));                                
//        obj++;
//        System.out.println(java.lang.System.identityHashCode(obj));                        
//        System.out.println(obj);        
    }
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
//        System.out.println(val1);
//        System.out.println(java.lang.System.identityHashCode(val1));                        
        testInts(val1++, ++val2);
        System.out.println(java.lang.System.identityHashCode(val1));                                
        System.out.println(val1+" "+val2);
    }    
}
