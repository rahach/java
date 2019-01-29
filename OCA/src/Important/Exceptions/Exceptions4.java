/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Exceptions;

/**
 *
 * @author raik
 */
public class Exceptions4 {

    public static void main(String[] args) throws Exception{
        
        
        try{

            m3();
            m2();            
        }
        catch (NewException | AnotherException e){
            System.out.println("catch");        
        }        
        finally{

            System.out.println("finally");

        }
        Float f = null;

        f = Float.valueOf("12.3");
        String s = f.toString();
        float i = Float.parseFloat(s);
        System.out.println(""+(int)i);
              int x  = ( x=3 ) * 4;  // 1
      System.out.println(x);
        
        
    }
    public static void m2() throws NewException { System.out.println("m2"); throw new NewException(); }

    public static void m3() throws AnotherException{ System.out.println("m3"); throw new AnotherException(); }        
   
    
}

