/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author 2923201
 */
public class CollectionTest1 {
 
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
 
        l1.add("Clark");
        l1.add("David");
        
        
        List<String> l2 = Arrays.asList("Peter", "Bruce");
        Set<String> s1 = new HashSet<>();
        s1.add("Peter");
        s1.add("Erwin");        
        l1.addAll(1, s1);       
        
        l1.forEach(System.out::println);

        // identisch, Methodenreferenz
        //l1.forEach(s -> System.out.println(s));        
        
        //l2.forEach(System.out::println);
        // identisch, Methodenreferenz
        //l2.forEach(s -> System.out.println(s));                
        System.out.println("-------------------------------");                
        
        
        System.out.println(l1.contains("Peter"));
        
        System.out.println("-------------------------------");                        
        
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("-------------------------------");        
        
        Iterator<String> itr = l1.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-------------------------------");        

        // Struktur durchlaufen und gleichzeitig verändern, funktioniert mit ArrayList nicht    
        //ListIterator<String> litr = l1.listIterator();
        for(int i = 0;i < l1.size(); i++){
            String s = l1.get(i);
            System.out.println(s);
            if(s.equals("Peter"))
                l1.remove(s);
        }
        
        //l1.forEach(System.out::println);        
        
        l1.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("-------------------------------");                

        for(int i = 0;i < l1.size(); i++){
            String s = l1.get(i);
            System.out.println(s);
            if(s.equals("Bruce"))
                l1.remove(s);
        }
 
        System.out.println("-------------------------------");                
        
        List<Integer> l3 = new ArrayList();
        l3.add(1);
        l3.add(3);
        l3.add(127);

        for(int i = 0;i < l1.size(); i++){
            int s = l3.get(i);
            System.out.println(s);
        }
        
        List<Integer> l4 = new ArrayList();
        l4.add(1);
        l4.add(3);
        l4.add(127);        
        
        System.out.println("gleich? " + l3.equals(l4));
 
        System.out.println("-------------------------------");                
        
        Integer i1 = 100;
        Integer i2 = 100;        

        System.out.println(Objects.equals(i1, i2));

        System.out.println("-------------------------------");                        

        
        // außerhalb des Pools , -128 bis 127
        Integer i3 = 128;
        Integer i4 = 128;        

        System.out.println(Objects.equals(i3, i4));

    }    
}
