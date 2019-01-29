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
public class Loop {
    public static void main(String[] args) {
        

        int i=0, j=0;
        X1: for(i = 0; i < 3; i++){
            X2: for(j = 3; j > 0; j--){
                if(i < j) continue X1;
                else break X2;
            }
        }
        System.out.println(i+" "+j);



        Loop p1 = new Loop();
        p1.foo();
        Loop p2 = new Loop();
        p2.foo();

        System.out.println(p1.a+" "+p2.a);        
    }


    static int a = 0;
    int b = 5;

    public void foo(){
        while(b>0){
            b--;
            a++;
        }
    }

}       
