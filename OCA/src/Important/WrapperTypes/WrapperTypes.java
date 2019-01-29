/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.WrapperTypes;

/**
 *
 * @author raik
 */
public class WrapperTypes {
    public static void main(String[] args) {
        
        Integer i1 = new Integer(9);    

        Integer i2 = 4;    

        System.out.println(i1);
        System.out.println(i2);        
        
        Short k = new Short((short)9); 
        System.out.println(k instanceof Short);        
        
        short s = 9;
        Short ss = s;
        System.out.println(ss instanceof Short);        
        
        
        int i = 2; 
        System.out.println(s == i);
        
        Short kk = 9; 
        Integer ii = 9; 
        //System.out.println(kk == ii);
        
        Integer in = 9; System.out.println( s == in );

        
        Object a = new String("A");
        System.out.println(a);
    }
}
