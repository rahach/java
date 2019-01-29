/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung.printer;

/**
 *
 * @author 2923201
 */
public class App {
    
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        
        InsuranceContract ic = new InsuranceContract();
        //ic.setData("neuer text");
        //ic.setData("neuer text 2");        
        cp.printOnPrinter(ic);
        
    }
    
}