/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Inheritance;
import java.io.*;
/**
 *
 * @author raik
 */
public class InheritanceTest3 {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
        

    }    
}

class Great {
    public void doStuff() throws IOException{
        System.out.println("Great");
    }    
}

class Amazing extends Great { 
  public void doStuff() throws IOException{
      System.out.println("Amazing");
  }    
}
