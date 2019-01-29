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
public class Test1_1 {

    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException me){
            me.printStackTrace();
        }
    }
    
    static void hello() throws MyException{
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }
    
    static void foo() throws MyException{
        throw new MyException("Exception from foo");
    }
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
    
    
    

