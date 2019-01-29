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
public class Casting {

    public static void main(String[] args) {

        Object t = new Integer(107);
//        int l = (Integer) t.intValue()/9;        //compilation error
        int k = ((Integer) t).intValue()/9;
        System.out.println(k);    
    }
    
}    
// Compiler will complain that the method intValue() is not available in Object. This is because the . operator has more precedence than the cast operator. So you have to write it like this:
//    int k = ((Integer) t).intValue()/9;
// Now, since both the operands of / are ints, it is an integer division. This means the resulting value is truncated (and not rounded). Therefore, the above statement will print 11 and not 12.
