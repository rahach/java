/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.APIs;

/**
 *
 * @author raik
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        System.out.println(StringBuilderTest.hidePhone("111-111-1111"));
        
        String s = "def";
        String sb = new StringBuilder("abc")+s.substring(0,1);
        sb = sb + "def";
        System.out.println(sb);
    }
    
    public static String hidePhone(String fullPhoneNumber){
        return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);
    }
}


