/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author raik
 */
public class UnderscoreNumbers {
    public static void main(String[] args) {
        
        int value = 1_000_000; //1
        switch(value){
            case 1_000_000 : System.out.println("A million 1"); //2
                break;
            case 10000000 : System.out.println("A million 2"); //3
                break;
        }
    }    
}
