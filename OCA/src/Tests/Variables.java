/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import java.util.Date;
/**
 *
 * @author raik
 */
public class Variables {

    static Date d;
    static int a = 0;

    public static void main(String[] args) {


        System.out.println(d);
        System.out.println(a);
        
        int x = a;
        int y = (x += a + 7);
        
        System.out.println(x);
        System.out.println(y);        
        
        int i = (int)700000000l;
        System.out.println(i);
        
        $1_sayHello();
        
    }
    
    static void $1_sayHello(){
        System.out.println("Hello");
    }
    
    
}
