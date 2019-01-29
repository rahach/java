/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;

/**
 *
 * @author raik
 */
public class Test1_5 {


    
    public static void main(String[] args) {

        String mStr = "123";
        long m1 = new Long(mStr);        
        long m2 = Long.parseLong(mStr);        
        long m3 = Long.valueOf(mStr);        
        long m4 = Long.valueOf(mStr).longValue();        
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    
}
