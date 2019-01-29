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
public class Labels {
    public static void main(String[] args) throws Exception {
        
        crazyLoop();
        

      int[] a = null;
//      int i = a [ 0 ];    // NullPointerException
//      int i = a [ method1() ];    // does not compile
   }
   public static int method1() throws Exception{
      throw new Exception("Some Exception");
   }
    
    static void crazyLoop(){
       int c = 0;
       JACK: while (c < 8){
            System.out.println(c);
            c++;            
            JILL: while (c < 8){
                if (c == 3) break JACK; 
                c++;                            
            }

        }
    }

    void m1(){
        Labels.m2();  // 1
        m4();             // 2
        new Labels().m3();  // 3
    }
    
    static void m2(){ }  // 4
    
    void m3(){
        m1();            // 5
        m2();            // 6
        new Labels().m1(); // 7
    }
    
    static void m4(){ }

    
    
}
