/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author raik
 */
public class Bunny3 {
    public static void main(String[] args) {
        good();
        System.out.println("qq");
    }
            static String s;
    
    public static void good(){
        try{

            System.out.println("ff");
            s.toString();
        }
        catch (NullPointerException e){
            System.out.println("hh");
            throw e;
        }        
        System.out.println("mm");
    }
    

}
