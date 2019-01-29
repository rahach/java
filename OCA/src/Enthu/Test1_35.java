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
public class Test1_35 implements IInt{
int m=7;
    public static void main(String[] args){
        Test1_35 s = new Test1_35();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
        System.out.println(j);
        System.out.println(k);        
        System.out.println(l);
    }

}

interface IInt{
    int thevalue = 50;
}
