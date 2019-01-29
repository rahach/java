/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import games.Farbe;
import games.Karte;
import games.Wert;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author 2923201
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Integer> user = new HashMap<>();
        user.put("Peter", 25);
        user.put("Bruce", 32);
        user.put("Clark", 54);        
        user.put("Clark", 24);       
        
        System.out.println(user);
        System.out.println(user.get("Bruce"));        

        Map<Integer, String> user2 = new HashMap<>();

        Map<Object, String> user3 = new HashMap<>();        
        
        Map<Karte, String> info = new HashMap<>();                

        user.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("-----------------------");        
        
        for(Integer i : user.values()){
            System.out.println(i);
        }

        System.out.println("-----------------------");        
        
        for(String s : user.keySet()){
            System.out.println(s);
            System.out.println(user.get(s));            
        }
        
        System.out.println("-----------------------");        
        
        for(Map.Entry<String, Integer> e : user.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());            
        }
         System.out.println("-----------------------");        
         
         Map<Karte, String> karten = new TreeMap<>();
         karten.put( new Karte(Farbe.PIK, Wert.Zehn), "Test");
         karten.put( new Karte(Farbe.PIK, Wert.Sieben), "Test");
         karten.put( new Karte(Farbe.PIK, Wert.Bube), "Test");         

        karten.forEach((k, v) -> System.out.println(k + ": " + v));
         
    }
    
}
