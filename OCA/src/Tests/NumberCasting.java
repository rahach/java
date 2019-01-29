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
public class NumberCasting {
    public static void main(String[] args) {
        char c = 320;
        System.out.println(c);
        float f = 320;
        System.out.println(f);
        double d = 320;
        System.out.println(d);
        byte b = (byte)2111;
        System.out.println(b);
        float f2 = 22.0f/7.0F;
        System.out.println(f2);
        float f3 = 120_000f / 2.0f;
        System.out.println(f3);
        double d2 = 120_000f / 2.0;
        System.out.println(d2);    
        long l = 0x99FFEE7898l;
        System.out.println(l);            
        
        int x=4;
        System.out.println(x/=4);                    
        
    }
}
