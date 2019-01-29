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
public class StringToLong {
    String mStr = "123";
//    long m = new Long(mStr);
//    long m = Long.parseLong(mStr);                
    long m = Long.valueOf(mStr).longValue();

//    long m = Long.longValue(mStr);    
//    long m =  (new Long()).parseLong(mStr);
    
    
    
    
    public static void main(String[] args) {
        StringToLong stl = new StringToLong();
        System.out.println(stl.m);
    }
}
