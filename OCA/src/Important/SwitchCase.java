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
public class SwitchCase {
    
    public static void main(String[] args) {
       
//        boolean flag  = true;
//        switch (flag){
//            case true : System.out.println("true");
//                default: System.out.println("false");
//        }    


        switchTest((byte)6);
    }    
    
    
    public static void switchTest(byte x){
       switch(x){
          case 'b':   // 1
          default :   // 2
          case -2:    // 3
          case 80:    // 4
       }
    }        
    
    
}


//Here are the rules for a switch statement:
//1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7). 
//2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
//3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
//4.  All case labels should be COMPILE TIME CONSTANTS. 
//5. No two of the case constant expressions associated with a switch statement may have the same value.
//6. At most one default label may be associated with the same switch statement.