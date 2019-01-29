/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticClassTest;

/**
 *
 * @author raik
 */
public class Counter {
    
    static int counter;
    
    Counter(){
        ++counter;
    }
    
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println(counter);
    }
    
    void test(){
        Counter counter1 = new Counter();        

    }
    
    
}
