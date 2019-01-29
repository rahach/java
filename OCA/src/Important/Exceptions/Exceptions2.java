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
public class Exceptions2 {
    public static void main(String[] args) {
        
        m2();
    }
    
    public void myMethod() throws Throwable{
        throw new MyException();
    }
    
    static Object m1(){
       return new Object(); 
    }
    static void m2(){
       String s = (String) m1();
    }    
    
}

class MyException extends Exception {}


