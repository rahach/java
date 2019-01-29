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
public class Karte implements Comparable<Karte>{
    private final Farbe farbe;
    private final Wert wert;
    
    public Karte(Farbe farbe, Wert wert){
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString() {
        return farbe + " " + wert;
    }

    @Override
    public int compareTo(Karte k) {
        int i = (wert.getValue() * farbe.getValue()) - (k.wert.getValue() * k.farbe.getValue());
        if(i == 0){
            i = farbe.compareTo(farbe);            
        }
        return i;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }


    
    
    
    
    
    
}
