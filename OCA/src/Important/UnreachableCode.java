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
public class UnreachableCode {
    public static void main(String[] args) {
        int x = 0;
        
//        while (false) { x = 3; }                   // unreachable statement

        for( int i = 0; i<0; i++) x = 3;        
        
//        for( int i = 0; false; i++) x = 3;                   // unreachable statement

        do{ x = 3; } while(false);
    }
}
