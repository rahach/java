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
public class NumberTypes {
 
    public static void main(String[] args) {
        


        long v = 0b10000L;
        System.out.println(v);

        long w = 010000L;
        System.out.println(w);
        
        long x = 10000L;
        System.out.println(x);

        long y = 0x10_000L;
        System.out.println(y);



        float fv = 0b10000;
        System.out.println(fv);

        float fw = 010000;
        System.out.println(fw);
        
        float fx = 10000f;
        System.out.println(fx);

        float fy = 0x10_000f;
        System.out.println(fy);

        

        double dv = 0b10000;
        System.out.println(dv);

        double dw = 010000d;
        System.out.println(dw);
        
        double dx = 10000d;
        System.out.println(dx);

        double dy = 0x10_000d;
        System.out.println(dy);

        
    short s = 10;   // 1
    char c = (char)s;     // 2
        System.out.println(c);
        

        
    }
    
}
