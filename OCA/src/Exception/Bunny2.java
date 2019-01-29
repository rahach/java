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
public class Bunny2 {
    public static void main(String[] args) {
        good();
    }
    
    public static void good(){
        try{
            eatCarrot();
        }
        catch (RuntimeException e){
            System.out.println(e);            
            System.out.println(e.getMessage());
            e.printStackTrace();            
        }        
    }
    
    public static void eatCarrot(){ 
        throw new RuntimeException("no more carrots");       
    }          
}
