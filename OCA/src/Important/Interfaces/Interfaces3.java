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
public class Interfaces3  implements I1, I2{

    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        Interfaces3 tc = new Interfaces3();
        ( (I1) tc).m1();
        System.out.println(((I2) tc).VALUE);        

    }
}

interface I1{
   int VALUE = 1;
   void m1();
}

interface I2{
   int VALUE = 2;
   void m1();
}
    