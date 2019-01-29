/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

/**
 *
 * @author 2923201
 */
public enum Farbe {
 
    HERZ(10), CARO(9), PIK(11), KREUZ(12);

    private final int value;
    
    private Farbe(int wert){
        this.value = wert;
    }
    
    public int getValue(){
        return value;
    }    
    
}
