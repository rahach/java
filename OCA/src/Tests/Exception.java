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
public class Exception {

   public static void main(String args[]){
      try{
         m1();
      }catch(IndexOutOfBoundsException e){
          try{
             System.out.println("1");
            throw new NullPointerException();             
          } catch (NullPointerException ex){   
            System.out.println("2");
          }
      }catch(NullPointerException e){
         System.out.println("222");
         return;
      }finally{
         System.out.println("4");

      }
      System.out.println("END");    
   }

   static void m1(){
      System.out.println("m1 Starts");
      throw new IndexOutOfBoundsException( "Big Bang " );
   }
}
