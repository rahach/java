/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;

/**
 *
 * @author raik
 */
public class Test1_28 {

   public static void main(String[] args){
      System.out.println("calculating");
      Calculator x = null;
      x.calculate();
   }
    
}

abstract class Calculator{
   abstract void calculate();

}