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
public class Operators {

    static boolean a;
    static boolean b;
    static boolean c;
    
    
    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2  = false;
        if (b2 = b1 == false){
           System.out.println("true");
        }        


        boolean bool1 = (a = true) || (b = true) && (c = true);         // || is a short circuit operator, the right part of the expression is not being evaluated  
        System.out.println(a + ", " + b + ", " + c);                    // only the leftmost expression is being evaluated and assigned the value true       
                                                                        
        boolean bool2 = (a = true) && (b = true) || (c = true);
        System.out.println(a + ", " + b + ", " + c);

        
        Y yy = new Y();
//        int k = (X) yy.y;     // compile time error; dot operator (.) has higher precedence than cast operator
//                              // yy.y returns Object of Y which is being cast to X; X and int are incompatible types   
        int k = ((X) yy).y;     // Reference yy of Object Y is being cast to X; field y thus referes to member y of class X, which is y=10    
        System.out.println(k);


        System.out.println("String".replace('g','g') == "String".replace('g','g'));
        
    }

    
}



class X{
    int y = 10;
}

class Y extends X{
    Y y = null;
}