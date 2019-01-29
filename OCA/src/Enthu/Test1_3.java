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
public class Test1_3 {

    public Test1_3(){
       s1 = sM1("1");
    }    
    
    static String s1 = sM1("a");
    
    String s3 = sM1("2");{
       s1 = sM1("3");
    }
    
    static{
       s1 = sM1("b");
    }
    
    static String s2 = sM1("c");
    
    String s4 = sM1("4");
    
    public static void main(String args[]){
        Test1_3 it = new Test1_3();
    }
    
    private static String sM1(String s){
       System.out.println(s);  return s;
    }


}
