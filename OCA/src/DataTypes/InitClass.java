/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author raik
 */
public class InitClass{
   
    public static int LENGTH = 5;
    
    public static void main(String args[ ] ){

        InitClass obj = new InitClass(5);
        
        System.out.println(test(4));
    }
 
    int m;
    static int i1 = 5;
    static int i2 ;
    int j = 100;
    int x;
    
    int a1 = 100000;
   
    
    private InitClass(boolean b){    
    
    }
    
    private InitClass(int m){
        this(true);
        int a2 = this.a1;
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m + " " + LENGTH + " " + a2);
    }
    
    
    static public long test(int x){
        long y = x * (long)x;

        x = -1;
        
        return y;
    }
    
    { j = 30; i2 = 40; }  // Instance Initializer
  
    static { 

        LENGTH = 10;
        i1++; 
    }      // Static Initializer
}