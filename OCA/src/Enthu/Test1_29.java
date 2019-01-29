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
public class Test1_29 {
    
    public static void main(String args[ ] ){
        A o1 = new C( );
        System.out.println(o1.m1( ) );     
        System.out.println(o1.m2( ) );    
        
        A o2 = new B( );
        System.out.println(o2.m1( ) );     
        System.out.println(o2.m2( ) );            

        B o3 = (B)o1;
        System.out.println(o3.m1( ) );     
        System.out.println(o3.m2( ) );            

        B o4 = new C();
        System.out.println(o4.m1( ) );     
        System.out.println(o4.m2( ) );                    

    }
}

class A { 
    int i = 10;  
    int m1( ) { return i; } 

    static int j = 1;    
    static int m2() { return j; }
}

class B extends A { 
    int i = 20;  
    int m1() { return i; } 

    static int j = 2;    
    static int m2() { return j; }
}

class C extends B { 
    int i = 30;  
    int m1() { return i; }

    static int j = 3;    
    static int m2() { return j; }
    
}