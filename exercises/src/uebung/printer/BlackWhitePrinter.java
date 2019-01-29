/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung.printer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2923201
 */
public class BlackWhitePrinter {
     
    private List<Printable> documents = new ArrayList<>();    

    public void printOnPrinter(Printable p){
        System.out.println(p.printData());
    }
    
}
