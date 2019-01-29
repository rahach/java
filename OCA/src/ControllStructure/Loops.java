/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllStructure;

/**
 *
 * @author raik
 */
public class Loops {
    public static void main(String[] args) {
        
        int x = 5, j = 0;

        OUTER: for(int i = 0; i < 3; ){
            System.out.println("i vor INNER: " + i);        
            System.out.println("x vor INNER: " + x);
            System.out.println("j vor INNER: " + j);                    

            INNER: do{
                System.out.println("i vor INNER incr: " + i);        
                System.out.println("x vor INNER incr: " + x);
                System.out.println("j vor INNER incr: " + j);                
                i++; x++;
                
                System.out.println("i nach INNER incr: " + i);        
                System.out.println("x nach INNER incr: " + x);                
                
                if(x>10){
                    System.out.println("x in (x>10): " + x);                                    
                    break INNER;
                }

                
                x += 4;
                System.out.println("x nach x+=4: " + x);                                
                
                j++;
                System.out.println("j nach INNER incr: " + j);                                
            } while (j <= 2);

            System.out.println("i nach INNER: " + i);        
            System.out.println("x nach INNER: " + x);
            System.out.println("j nach INNER: " + j);                    
        }    
            
            
        System.out.println(x);


//    int x = 5, j = 0;
//    for(int i = 0; i < 3;){
//        System.out.println("i vor incr: " + i);
//        i++; 
//        System.out.println("i nach incr: " + i);
//        
//        x++;
//
//        System.out.println("j vor incr: " + j);
//        j++;
//        System.out.println("j nach incr: " + j);
//        
//    }
//        System.out.println(x);
//
    }
}
