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
public class Ternary {
    public static void main(String[] args) {
        
        int i = 10;
        
        if((i>10?i++:--i)<10){
            System.out.println("i in Bear"+i);
            System.out.println("Bear");
        }
        else{
            System.out.println("i in shark"+i);            
            System.out.println("Shark");
        }

        int grossIncome = 37000;
        
//          double taxRate = grossIncome<=18000 ? 0 : (grossIncome<=36000) ? .1 : .2;
        
//        double taxRate = .2;
//        taxRate = grossIncome<=18000?0:.1;
//        taxRate = grossIncome<=36000?.1:.2;
//        
//        double taxRate = 0;
//        if(grossIncome>36000) taxRate = .20;
//        if(grossIncome>18000 && grossIncome<=36000) taxRate = .10;
//        
//        double taxRate = .2;
//        if(grossIncome>36000) {
//           taxRate = .2;
//        }else taxRate = 0;
//        if(grossIncome>18000 ) {
//           taxRate = .1;
//        }
        
        double taxRate = 0;
        taxRate = grossIncome>18000?grossIncome<=36000?.1:.2:0;


        System.out.println(taxRate);

       
    }
}
