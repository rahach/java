/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author raik
 */
public class Varargs {
 
    public static void main(String[] args) {

        System.out.println(test1(true, new boolean[2]));
        System.out.println(test1(true, new boolean[] {true, true}));        
        System.out.println(test2(new boolean[] {true, true, false}, new boolean[] {true, true}));                
        System.out.println(test2(new boolean[] {true, true, false}, new boolean[] {}));                        
    }
    
    private static int test1(boolean b, boolean... b2){
        return b2.length;
    }

    private static int test2(boolean[] b, boolean[] b2){
        return b2.length;
    }

}