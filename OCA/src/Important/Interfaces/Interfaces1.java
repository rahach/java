/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Interfaces;

/**
 *
 * @author raik
 */
public class Interfaces1 implements Int{

    public static void main(String[] args){

        Interfaces1 s = new Interfaces1();  //1
        int j = s.thevalue;       //2
        System.out.println(j);
        
        int k = Int.thevalue;    //3
        System.out.println(k);        
        
        int l = thevalue;         //4
        System.out.println(l);
        
        int m = Interfaces1.thevalue;
        System.out.println(m);   
        
        test();

    }

    static void test(){
        int n = thevalue;
        System.out.println(n);                
    }
    
}

interface Int{
    int thevalue = 50;
}


//As a rule, fields defined in an interface are public, static, and final. The methods are public. 
//Here, the interface Int defines thevalue and thus any class that implements this interface gets this field. 
//Therefore, it can be accessed using s.thevalue or just thevalue inside the class. Also, since it is static, 
//it can also be accessed using Int.thevalue or Interfaces.thevalue.

