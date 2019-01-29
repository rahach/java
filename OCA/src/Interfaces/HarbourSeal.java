/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author raik
 */
class HarbourSeal extends Seal {

    @Override
    void swimming() {
        System.out.println("swimming...");
    }

    @Override
    public void lactating() {
        System.out.println("lactating...");
    }

    @Override
    public void breathing() {
        System.out.println("breathing...");
    }

    @Override
    public double bodyTemp(){
        return 33.0;
    };

    @Override
    public double bodyTemp(String a){
        return 33.0;
    };
    
    public String name(){
        return "HarbourSeal";
    }
    
}
