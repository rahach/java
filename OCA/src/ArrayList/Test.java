/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raik
 */
public class Test {
    public static void main(String[] args) {
        
        int[] array = {6,9,8};
        
        List<Integer> list = new ArrayList<>();
        
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        try{
            System.out.println(list);
            throw new IllegalArgumentException();
        }    
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
    
}
