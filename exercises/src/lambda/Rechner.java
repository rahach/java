/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 2923201
 */
public class Rechner {
    
    public static final MathOperation ADD = (a, b) -> a + b;
    public static final MathOperation SUBSTRACT = (a, b) -> a - b;    
    public static final MathOperation MULTIPLY = (a, b) -> a * b;    
    public static final MathOperation DIVIDE = (a, b) -> a / b;    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("A: ");
        int a = input.nextInt();
        
        System.out.println("B: ");
        int b = input.nextInt();        

        System.out.println("OPERATION: ");
        String op = input.next();
        System.out.println();
               
        int rand = new Random().nextInt(100);
        
        
        
        switch(op){
            case "+": startOperation(ADD, a, b); break;
            case "-": startOperation(SUBSTRACT, a, b); break;
            case "*": startOperation(MULTIPLY, a, b); break;
            case "/": startOperation(DIVIDE, a, b); break;               
            case "%": startOperation((w1, w2) -> w1 % w2, a, b); break;                           
            case "#": startOperation((w1, w2) -> w1 * w2 * rand, a, b); break;                                       
        }
        
    }

    static void startOperation(MathOperation op, int a, int b){
        System.out.println(op.start(a, b));
    }
        
}  


//SAM
@FunctionalInterface
interface MathOperation{
    int start(int a, int b);
}



//generic
@FunctionalInterface
interface AnotherMathOperation<T extends Number>{
    T start(T a, T b);
}