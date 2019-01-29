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
public class OperationsOnNull {

    static String s1;    

    public static void main(String[] args) {        
        String s2 = null;
//        s.concat("AA");  //NullPointerException
//        s1.concat("AA");  //NullPointerException
        System.out.println(s1 + "A");
        System.out.println(s2 + "B");        

        String arr[] = new String[2];
            
        for(String s :arr)
//            s.concat("B");    //NullPointerException
            System.out.println(s);

    }

}
