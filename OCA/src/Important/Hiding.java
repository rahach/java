/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

/**
 *
 * @author raik
 */
public class Hiding {

    public static void main(String[] args) {        
        AAA a = new BBB();        
        a.sM1();        
        a.sM2();
        
        System.out.println(new Boolean( true) + ""); 
        

        
    }
}


class AAA{        
    static void sM1() {  System.out.println("In base static"); }
    public void sM2() {  System.out.println("In base static"); }
}

class BBB extends AAA{
    public static void sM1() {  System.out.println("In sub static"); }

    public void sM2() {  System.out.println("In sub non-static"); }
}