/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localdate;

import java.time.LocalDate;
/**
 *
 * @author 2923201
 */
public class LocalDateTest {
    
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();        
        System.out.println(o1.hashCode()); 
        System.out.println(o2.hashCode()); 
        
        LocalDate d = LocalDate.of(1973, 10, 11);
        System.out.println(d); 
        System.out.println(d.hashCode());         

        LocalDate d1 = LocalDate.of(1973, 10, 11);
        System.out.println(d1); 
        System.out.println(d1.hashCode());
        
        System.out.println("-------------------------");
        String s1 = "Moin";
        String s2 = new String("Moin");
        System.out.println(s1.hashCode());        
        System.out.println(s2.hashCode());                
        
        System.out.println("-------------------------");
        Integer i1 = 1;
        Byte b1 = 1;
        System.out.println(i1.hashCode());        
        System.out.println(b1.hashCode());                        
    }
    

    
}
