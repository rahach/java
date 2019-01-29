/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.StringBuilder;

/**
 *
 * @author raik
 */
public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("ef");        
        System.out.println(a);
        System.out.println(b);
        b.append("g");
        System.out.println(a);
        System.out.println(b);        
    }
}
