/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author 2923201
 */
public class ExceptionTest {
    
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
            et.getDataFromFile();
        }
        catch(IOException ex){            
            System.out.println(ex.getLocalizedMessage());
        }                
        
        int wurstInGramm = 5;
        try{
            if(wurstInGramm < 6)
                throw new ButterBrotException();
        }
        catch(ButterBrotException ex){
            wurstInGramm = 15;
        }
    }   
    
    private void getDataFromFile() throws FileNotFoundException, IOException{
        
        try(FileInputStream fis = new FileInputStream("data.txt")){
            
        }
    }
    
}

class ButterBrotException extends Exception{
    
    public ButterBrotException(){
        System.out.println("Nicht genug Wurst!");
    }
}
