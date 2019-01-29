/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enthu;

/**
 *
 * @author raik
 */
public class Test1_15 {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }
    
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        Test1_15 ot = new Test1_15();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
    }
}
