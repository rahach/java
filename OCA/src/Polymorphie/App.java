/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphie;

/**
 *
 * @author raik
 */
public class App {
    public static void main(String[] args) {
        
        Lemur lemur = new Lemur();
        
        System.out.println(lemur.className());                        
        
        Primate primate = new Lemur();
        
        System.out.println(primate.className());                        
        
//        Appearance appearance = lemur;
        
//        System.out.println(appearance.hasTail());        
//        System.out.println(appearance.isStripedTail());
//        System.out.println(appearance.numLegs());                
//        System.out.println(appearance.className());                                

//        Lemur lemur2 = (Lemur)appearance;
        
//        System.out.println(lemur.hasTail());        
//        System.out.println(lemur.isStripedTail());
//        System.out.println(lemur.numLegs());                
//        System.out.println(lemur.className());                        

//        Lemur lemur3 = (Lemur)primate;
        
//        System.out.println(lemur3.hasTail());        
//        System.out.println(lemur3.isStripedTail());
//        System.out.println(lemur3.numLegs());                
//        System.out.println(lemur3.className());      
        
        
//        Primate primate2 = new Primate();
//        if(primate2 instanceof Lemur){
//            Lemur lemur4 = (Lemur)primate2;
//        }
    }
}
