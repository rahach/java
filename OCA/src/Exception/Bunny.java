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
public class Bunny {
    public static void main(String[] args) {
        good();
    }
    
    public static void good(){
        try{
            eatCarrot();
        }
        catch (NoMoreCarrotsException e){
            System.out.println(e.getMessage());
        }        
    }
    
    public static void eatCarrot() throws NoMoreCarrotsException{
        
    }          
}

class NoMoreCarrotsException extends Exception{ }