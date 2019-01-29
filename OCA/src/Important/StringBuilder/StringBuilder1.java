/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.StringBuilder;

/**
 *
 * @author raik
 */
public class StringBuilder1 {
    public static void main(String[] args) {
        
     String s1 = new String("java");
     StringBuilder s2 = new StringBuilder("java");
     replaceString(s1);
     replaceStringBuilder(s2);
     System.out.println(s1 + s2);
     
     
     String : for(int i = 0; i< 10; i++){
        for (int j = 0; j< 10; j++){
             if ( i+ j > 10 )  break String;
        }
        System.out.println( "hello");
     }     
     
  }

  static void replaceString(String s) {
     s = s.replace('j', 'l');
  }
  static void replaceStringBuilder(StringBuilder s) {
     s.append("c");
  }
}