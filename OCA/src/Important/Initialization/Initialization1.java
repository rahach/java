/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Initialization;

/**
 *
 * @author raik
 */
public class Initialization1 {
    
    public static void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(cA);
        System.out.println(cA[1] + ", " +  cA[1] );
    }
    public static void m2(char[ ] cA){
        cA[1] = cA[0] = 'm';
    }    
    
    
    
    public static void main(String[] args) {
        
         m1();
        
        
        
        
        
    }
    
    
    
}
