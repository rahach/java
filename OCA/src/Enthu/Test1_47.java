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
public class Test1_47 {
    
   public static void main(String args[ ] ){
        int i = 0 ;
      boolean bool1 = true ;
      boolean bool2 = false;
      boolean bool  = false;
      bool = ( bool2 &  method1(i++) ); //1
      bool = ( bool2 && method1(i++) ); //2
      bool = ( bool1 |  method1(i++) ); //3
      bool = ( bool1 || method1(i++) ); //4
      System.out.println(i);
//        System.out.println(i);
//        method1(i++);
//        System.out.println(i);
   }
   
   public static boolean method1(int i){
//       System.out.println(i);
       return i>0 ? true : false;
   }
}
