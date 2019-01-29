/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 *
 * @author 2923201
 */
public class CollectionUtilsTest {

    public static void main(String[] args) {
        ArrayList<Integer> ints = IntStream.range(0, 1000)
                .boxed()
                .parallel()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

//        ints.forEach(System.out::println);

        //Collections.sort(ints);
        Collections.shuffle(ints);
        ints.remove(273);
        System.out.println(Collections.binarySearch(ints, 273));
        
        Collections.addAll(ints, 1, 16, 44, 77, 96);
        System.out.println(Collections.binarySearch(ints, 96));        
        
        
    }

    
}
