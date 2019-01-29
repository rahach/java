/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 2923201
 */
public class SetTest {
    
    public static void main(String[] args) {
        Set<String> s1 = new HashSet();
        s1.add("Peter");
        s1.add("David");
        s1.add("Bob");
        s1.add("Zippo");        

        // Duplikat wird nicht angenommen, aber kein Fehler
        s1.add("Bob");        
        
        s1.forEach(s->System.out.println(s + ", " + s.hashCode()));

        System.out.println("-----------------------");

        String[] arr = s1.toArray(new String[4]);
        
        System.out.println("-----------------------");        
        
        Set<Thing> things = new HashSet<>();
        things.add(new Thing("Hammer"));
        things.add(new Thing("Zange"));
        things.add(new Thing("Hammer"));        
        
        things.forEach(t -> System.out.println(t.getName() + ", " + t.hashCode()));

        List<Thing> list1 = new ArrayList<>();
        list1.add(new Thing("Hammer"));
        list1.add(new Thing("Zange"));

        List<Thing> list2 = (ArrayList<Thing>) ((ArrayList)list1).clone();
        list2.get(1).setName("Schraubendreher");
        list1.forEach(s -> System.out.println(s.getName()));

        Set<Integer> s2 = new TreeSet<>();
        s2.add(1);
        s2.add(22);
        s2.add(1);
        s2.add(5);
        s2.add(1);        
        s2.forEach(s -> System.out.println(s));

        System.out.println("-----------------------");        

        Set<String> s3 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        s3.add("jlkj");
        s3.add("JLKJ");
        s3.add("123");
        s3.add("&786(/&8");
        s3.add("Max");
        s3.add("Macks");       
        s3.forEach(s -> System.out.println(s));

        System.out.println("-----------------------");        

        Set<Thing> s4 = new TreeSet<>(new StringComparator());
        s4.add(new Thing("Hammer"));
        s4.add(new Thing("Zange"));
        s4.add(new Thing("Z"));        
        s4.add(new Thing("Schraubendreher"));
        s4.add(new Thing("Schraubenschlüssel"));        

        s4.forEach(s -> System.out.println(s.getName()));
        
        NavigableSet<LocalDate> s6 = new TreeSet<>();
        s6.add(LocalDate.of(2000, 10, 5));
        s6.add(LocalDate.of(2000, 10, 6));
        s6.add(LocalDate.of(2000, 10, 4));
        s6.add(LocalDate.of(2010, 01, 01)); 
        s6.add(LocalDate.of(1999, 10, 5));         
        /*
        System.out.println(s6.lower(LocalDate.of(1999, 10, 7)));
        System.out.println(s6.higher(LocalDate.of(1999, 10, 7)));        
        System.out.println(s6.floor(LocalDate.of(1999, 10, 7)));                
        System.out.println(s6.ceiling(LocalDate.of(1999, 10, 7)));  
        */
        LocalDate d;

        System.out.println(s6.last());
        
        while((d = s6.pollFirst())!=null){
            System.out.println(d);
        }
        
        System.out.println("-----------------------");                

        
    }    
}



enum Wochentag{
    MO, DI, MI, DO, FR, SA, SO;
}


class StringComparator implements Comparator<Thing>{

    @Override
    public int compare(Thing t1, Thing t2) {
        return (t1.getName().length() - t2.getName().length());
    }    

}



class Thing implements Comparable<Thing>{
    private String name;
        
    public Thing(String name){
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){        
        if(obj instanceof Thing)
            return name.equals(((Thing)obj).getName());        
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    String getName(){
        return name;
    }
    
    public boolean setName(String name){

        this.name = name;
        return true;
    }    

    @Override
    public int compareTo(Thing o) {
//        return (name.length() - o.name.length());
        return name.toLowerCase().compareTo(o.name.toLowerCase());
    }
    
    
    
    
}