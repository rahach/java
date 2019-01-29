/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;
import java.lang.System;
/**
 *
 * @author raik
 */
public class Test1_16 {
    String result="done";

    public void shed(){
        System.out.println(result);
    }

    public static void testInts(Integer obj, int var){

        obj = var++;

        obj++;

    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        System.out.println(java.lang.System.identityHashCode(val1));                        
        int val2 = 9;        

        testInts(val1++, ++val2);
        System.out.println(java.lang.System.identityHashCode(val1));                                
        System.out.println(val1+" "+val2);
        
        otherTest(true);
        Test1_16 t = new Test1_16();
        t.shed();
    }    

    static void otherTest(boolean hungry){
        if(hungry){
            int test1 = 1;
            {
                int test2 = 2;
                System.out.println(test1);
                System.out.println(test2);                
                System.out.println(hungry);                
            }
            System.out.println(test1);            
//            System.out.println(test2);                        
            System.out.println(hungry);
        }
        //System.out.println(test1);            
        //System.out.println(test2);                        
        System.out.println(hungry);
    }

    
}
