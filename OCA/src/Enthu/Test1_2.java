/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;

/**
 *
 * @author raik
 */
public class Test1_2 {
    public static void main(String[] args) {
        char c;        
        int i;
        
        c = 'a';//1
        System.out.println(c);
        i = c;  //2
        System.out.println(i);        
        i++;    //3
        System.out.println(i);
        c = (char)i;  //4
        System.out.println(c);
        c++;    //5
        System.out.println(c);
    }
    
}
