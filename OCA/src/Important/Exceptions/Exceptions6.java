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
public class Exceptions6 {
    
   public static void methodX() throws Exception { 
       //throw new Exception();
      throw new AssertionError();
   }  

   public static void main(String[] args) {
      try{ 
         methodX(); 
      } 
      catch(Exception e) {
        System.out.println("EXCEPTION");
      }
   }
}