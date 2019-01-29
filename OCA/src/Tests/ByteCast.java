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
public class ByteCast {


   public static void main(String args[ ] ){
      byte b = -128 ;
      int i = b ;
      b = (byte) i;
      System.out.println(i+" "+b);
   }


    
}
