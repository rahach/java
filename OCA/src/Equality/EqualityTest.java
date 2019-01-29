/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equality;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author raik
 */
public class EqualityTest {
    public static void main(String[] args) {
        
        StringBuilder one = new StringBuilder("a");
        StringBuilder two = new StringBuilder("a");
        StringBuilder three = one.append("a");        
        System.out.print((one==two) + " ");
        System.out.print((one==three) + " ");
        System.out.print((one.equals(two)) + " ");
        System.out.println((one.equals(three)) + " ");
        
        String a = "Hallo";
        String b = "Hallo";        
        String c = new String("Hallo");
        System.out.print((a==b) + " ");
        System.out.print((a.equals(b)) + " ");        
        System.out.println((a==c) + " ");        
        
        String x = "Hallo";
        String y = " Hallo ".trim();
        System.out.print((x==y) + " ");
        System.out.println((x.equals(y)) + " ");
        
        StringBuilder stb = new StringBuilder("Hallo");
        String str = "Hallo";
//        System.out.println(stb==str);
        System.out.println(stb.equals(str));        
        

        int[] arr = {8,16,3,35,77,90};
        System.out.println(arr.length);

        System.out.println();        

        for(int i: arr)
            System.out.println(i);
        Arrays.sort(arr);
        
        System.out.println();
        
        for(int i: arr)
            System.out.println(i);

        System.out.println();

        System.out.println(Arrays.binarySearch(arr, 0));        
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 10));        
        
        String[] sa[] = {{"a","n", "k"}, {"j"},  {"o", "l"}};
        for(String[] s: sa)
            for(String st: s)
                System.out.println(st);        

        String[] sarr[] = new String[2][1];
//        for(String[] s: sarr)
//            for(String st: s)
//                System.out.println(st);        

        System.out.println();        
        
        System.out.println(sarr[0][0]);

        System.out.println();        
        
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList(10);
        ArrayList l3 = new ArrayList(l2);        

        List<String> l4 = new ArrayList<>();
        l4.add("tree");
        l4.add(0,"flower");
        l4.add("plant");        
        l4.add("mushroom");                
        System.out.println(l4.size());
        System.out.println(l4);
        l4.remove("mushroom");                        
        System.out.println(l4);        

        System.out.println(); 
        
        Object o1 = new Object();
        Object o2 = o1;
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));        

        System.out.println(); 
        
        Object o3 = new Object();
        Object o4 = new Object();
        System.out.println(o3 == o4);
        System.out.println(o3.equals(o4));               
        
        System.out.println();         
        
        String str1 = new String("Hallo");
        String str2 = str1;
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));                

        System.out.println();         
        
        String str3 = new String("Hallo");
        String str4 = new String("Hallo");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));                

        System.out.println();         
        
        String str5 = new String("Hallo");
        String str6 = "Hallo";
        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));                        

        System.out.println();         

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);        
        
        LocalDateTime ldt2 = LocalDateTime.of(2015,3,3,15,22,33);
        System.out.println(ldt2);                
        
        ldt2 = ldt2.plusYears(3);
        System.out.println(ldt2);                        

        System.out.println(ldt2.getDayOfYear());                        
        System.out.println(ldt2.getDayOfWeek());                                
        System.out.println(ldt2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));     
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(ldt2.format(dtf));                                                
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
        System.out.println(ldt2.format(dtf2));                
        
        
        int[] arr5 = new int[0];

        
        Object o;
        int i;
        
        char ic = 'k';
        switch(ic){
            case 9: System.out.println("case");
            default: System.out.println("default");
        }
        
        ExtAbstrClass eac = new ExtAbstrClass();
        eac.test();
    }
}


abstract class AbstrClass extends EqualityTest{
    
    abstract void test();
}

class ExtAbstrClass extends AbstrClass{
    
    void test(){ System.out.println("ExtAbstrClass"); }
    
}



