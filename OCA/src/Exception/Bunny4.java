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
public class Bunny4 {
    public static void main(String[] args) {
        good();

    }

    
    public static void good(){
        try{
            Object o = new Integer(3);
            String s = (String)o;
            System.out.println(s);
        }
        catch (NullPointerException e){

        }        

    }    
}
