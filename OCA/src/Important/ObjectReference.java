/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

/**
 *
 * @author raik
 */
public class ObjectReference {

    public static void main(String[] args) throws Exception {
        Data d1 = new Data(10);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
    }
    
}


class Data {

    int intVal = 0;
    String strVal = "default";
    public Data(int k){
        this.intVal = k; 
    }

}

