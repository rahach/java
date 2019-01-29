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
public class Exceptions3 {

    public static void main(String[] args) throws Exception{
        try{
            m2();
        }
        catch (NewException e){
        
        }        
        finally{
            try{
                m3();
            }
            catch(AnotherException ae){
                
            }
            finally{
                System.out.println("done");
            }
        }
    }
    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }        
}



class NewException extends Exception {}

class AnotherException extends Exception {}
