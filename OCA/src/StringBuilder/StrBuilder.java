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
public class StrBuilder {


    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char c='a'; c <= 'z'; c++){
            sb.append(c);            
        }

        System.out.println(sb);        
        System.out.println(sb.length());        
        System.out.println(sb.capacity());                

        sb.setLength(10);        
        sb.setCharAt(0, 'A');                

        System.out.println(sb);        
        System.out.println(sb.length());        
        System.out.println(sb.capacity());                        
        sb.insert(10, "Z");
        System.out.println(sb);                
        System.out.println(sb.length());        
        System.out.println(sb.capacity());                        
        sb.deleteCharAt(3);                                
        System.out.println(sb);                
        System.out.println(sb.length());        
        System.out.println(sb.capacity());                                
        
        String sub = sb.substring(sb.indexOf("A"), sb.indexOf("e"));
        System.out.println(sub);
        

    }
}
