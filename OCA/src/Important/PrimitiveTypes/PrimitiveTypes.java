/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.PrimitiveTypes;

/**
 *
 * @author raik
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        
        int i = 4;
        System.out.println("i: "+i);
        System.out.println("i: "+((Object)i).getClass().getName());                
        float f = i;        
        System.out.println("f: "+f);
        System.out.println("f: "+((Object)f).getClass().getName());    
        f++;        
        System.out.println("f++: "+f);
        System.out.println("f++: "+((Object)f).getClass().getName());            
        double d = f;        
        System.out.println("d: "+d);
        System.out.println("d: "+((Object)d).getClass().getName());            
        d++;        
        System.out.println("d++: "+d);
        System.out.println("d++: "+((Object)d).getClass().getName());        
        
        
        double d2 = i%f;
        System.out.println("d2: "+d2);
        System.out.println("d2: "+((Object)d2).getClass().getName());                
        
        int i2 = (int)( i%f);
        System.out.println("i2: "+i2);
        System.out.println("i2: "+((Object)i2).getClass().getName());                        

        byte b = 5;
        System.out.println("b: "+b);
        System.out.println("b: "+((Object)b).getClass().getName());                        
        
        b++;
        System.out.println("b++: "+b);
        System.out.println("b++: "+((Object)b).getClass().getName());                                
        
        byte b2 = 4;
        System.out.println("b%b2: "+ b%b2);
        System.out.println("b%b2: " +((Object)(b%b2)).getClass().getName());                                        
        
        char c = 'A';
        System.out.println("c: "+ c);
        System.out.println("c: " +((Object)c).getClass().getName());                                                

        c++;
        System.out.println("c++: "+ c);
        System.out.println("c++: " +((Object)c).getClass().getName());                                                        
        
        char c2 = (char)(c+1);
        System.out.println("c+1: "+ c2);
        System.out.println("c+1: " +((Object)c2).getClass().getName());                                                                
        System.out.println("c2: " +((Character)c2));                                                                        
    }
}
