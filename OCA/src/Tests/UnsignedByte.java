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
public class UnsignedByte {

    private UnsignedByte(){
        
    }    
    
    private UnsignedByte(int a){
      this();    
    }


    
  public static int test(int i){
      return i * 2;
  }  
  
  int b = 4;
  static int c = 4;  
  public static void main(String[] args){

      int a = 5;      
      
      UnsignedByte ub = new UnsignedByte(a);

      int d = 0;
      String e = new String();
      e.valueOf(d);
      e.concat("f");
      System.out.println(e);
      System.out.println(c+e);      
  }
}


class Bird{

}