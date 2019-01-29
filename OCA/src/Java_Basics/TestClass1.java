/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Basics;
import java.io.*;

/**
 *
 * @author raik
 */
public class TestClass1{
  public static void main(String[] args){
     PrintWriter pw = new PrintWriter(System.out);
     OutputStreamWriter osw  =  new OutputStreamWriter( System.out );
     pw.print("hello");
  }
}
