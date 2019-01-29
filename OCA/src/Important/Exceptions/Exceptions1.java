/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Exceptions;

/**
 *
 * @author raik
 */
public class Exceptions1 {
 
    public static void main(String[] args){
        Exceptions1 tc = new Exceptions1();
        try{
            tc.myMethod();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void myMethod(){
        try{        
            yourMethod();
        }   
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void yourMethod() throws Exception{
        throw new Exception();
    }     
    
}
