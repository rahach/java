/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder;

/**
 *
 * @author raik
 */
public class Test {

    private static String $;    

    String bbb;
    
    public static void main(String[] args) {
        
        String a_b;
        
        String s1 = "Java";
        String s2 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
         System.out.println(sb1.toString() == s2);
        System.out.println(sb1.toString().equals(s2));         

        System.out.println($);
//        System.out.println(a_b);
        
        Test test = new Test();
        System.out.println(test.bbb);
        
    }
}
