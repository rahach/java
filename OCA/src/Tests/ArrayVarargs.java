/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

/**
 *
 * @author raik
 */
public class ArrayVarargs {
    public static void main(String[] args) {

        int[] arr1[] = {{1}}; 
        
        int[] arr2[] = new int[][] {{1}};         

        int[] arr3[] = new int[2][];                 
        
        arr3[0][0] = 2;        
        
        test(1, new int[3]);
        
    }
    
    
    static void test(int start, int... arr){

        System.out.println(arr.length);

        for(int i: arr){
            System.out.println(i);
        }
        


    }
    
}
