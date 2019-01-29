/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

/**
 *
 * @author raik
 */
public class VariableScope {

    static boolean b;    

   public static void main(String[] args){  

       new VariableScope().sayHello(); 
   

       String arr[] = {"1","1","4"};



       switch(Integer.parseInt(arr[1]))  //1
       {
          case 0 :
             b = false;
             break;
     
          case 1 :
             b = true; //2
             break;
       }
       
       if(b) System.out.println(arr[2]);       
       
       
   
   }   //1



   public static void sayHello(){ System.out.println("Static Hello World"); }  //2
//   public void sayHello() { System.out.println("Hello World "); }  //3 compilation error: method "sayHello" already defined


    
}



