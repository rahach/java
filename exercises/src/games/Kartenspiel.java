/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 2923201
 */
public class Kartenspiel {

    public static final Queue<Karte> karten = create();    
    
    public static final Comparator<Karte> FARBE_WERT_SORT;    
    public static final Comparator<Karte> WERT_FARBE_SORT;        
    
    static{
        FARBE_WERT_SORT = (a, b) -> (
                int i = a.getFarbe().getValue() - b.getFarbe().getValue();
                if(i == 0)
                    return  a.getWert().getValue() - b.getWert().getValue();
                return i;
                );
                /*
        WERT_FARBE_SORT = (a, b) -> (
                int i = a.getWert().getValue() - b.getWert().getValue();       
                if(i == 0)
                    return  a.getFarbe().getValue() - b.getFarbe().getValue();

                return i;        
                );
 */
}
   
    public static void main(String[] args) {
        
        Collections.shuffle((List<Karte>)karten);
        Collections.sort((List<Karte>)karten, WERT_FARBE_SORT);
        
        while(!karten.isEmpty()){
            System.out.println(karten.poll());
        }

        System.out.println("-----------------------");        

        
    }
    
    private static Queue<Karte> create(){

        Queue<Karte> karten = new LinkedList<>();
        
        for(Farbe f : Farbe.values()){            
            for(Wert w : Wert.values()){
                karten.offer(new Karte(f, w));
            }            
        }
        return karten;
    }
    
}


class StringComparator implements Comparator<Karte>{

    @Override
    public int compare(Karte k1, Karte k2) {
        return k1.toString().compareTo(k2.toString());
    }    

}

