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
class SomeClass{
    String s1 = "green mile";   // 0
   
    public void generateReport( int n ){
        String local;   // 1
        if( n > 0 ) local = "good";   //2
        else local = "good";   //2
        System.out.println( s1+" = " + local );   //3
    }
   
    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        sc.generateReport(0);           
    }
    
}
