/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author raik
 */
public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();

        sc.iterate1();
        sc.iterate2();        
        sc.iterate3();                
    }
    
    public void iterate1(){

        System.out.println("iterate1:");         
        int count = 0;
        int x = 3;
        while(count++ < 3){
            System.out.println("count:" + count);
            int y = (1 + 2 * count) % 3;
            System.out.println("y:" + y);
            
            switch(y){
                default:
                case 0: x -= 1; break;
                case 1: x += 5;                
            }                        
            System.out.println("x:" + x);
        }
        System.out.println("---------------------"); 
    }    
    

    
    public void iterate2(){

        System.out.println("iterate2:");         

        int y = 0;
        int x = 0;
        
        switch(y){


            case 0: x -= 1; 
            
            
            case 1: x += 5;               
            case 2: x += 5;                           
            default: x += 5;           
        }                        
        System.out.println(x); 
        System.out.println("---------------------"); 
    }        
    
    public void iterate3(){

        System.out.println("iterate3:");         

        String str = "MyString";
        int x = 0;
        
        switch(str){


            case "": x -= 1; 
            
            
            case "mystring": x += 5;               
            case "MyString": x += 5;                           
            default: x += 5;           
        }                        
        System.out.println(x); 
        System.out.println("---------------------"); 
    }    
    
}
