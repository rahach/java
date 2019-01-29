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
public class Equality {

    
    public static void main(String[] args) {
        
        Integer i = new Integer(1) ;
        Integer j = new Integer(1) ;        
        Integer k = new Integer(10) ;        
        int l = 1 ;        
        
        Long m = new Long(1);
        long n = 1;

        Object o1 = new Integer(1);
        Object o2 = new Long(1);        
        
        if( i.equals(i)) System.out.println("equal");   // 1
        else System.out.println("not equal");        
        
        if( i.equals(j)) System.out.println("equal");   // 1
        else System.out.println("not equal");                
        
        if( i.equals(k)) System.out.println("equal");   // 1
        else System.out.println("not equal");                        

        if( i.equals(l)) System.out.println("equal");   // 1
        else System.out.println("not equal");                        
        
        if( i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");                        

        if( i.equals(n)) System.out.println("equal");   // 1
        else System.out.println("not equal");                        
                
        if( o1.equals(o2)) System.out.println("equal");   // 1
        else System.out.println("not equal");   
        
        
        int ii = 10;
        System.out.println(ii<20 ? out1() : out2());

    }

    public static int out1(){ System.out.println("out1"); return 1; }
        
    public static int out2(){ System.out.println("out2"); return 2; }
    
    
}
