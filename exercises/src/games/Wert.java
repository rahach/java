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
public enum Wert {
    As(11), König(2), Dame(3), Bube(4), Zehn(10), Neun(9), Acht(8), Sieben(7);

    private final int value;
    
    private Wert(int wert){
        this.value = wert;
    }
    
    public int getValue(){
        return value;
    }
}
