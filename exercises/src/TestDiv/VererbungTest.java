/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDiv;

/**
 *
 * @author 2923201
 */
public class VererbungTest {
    public static void main(String[] args) {
        new CC().machWasAnderes();
        BB.machWasAnderes();
    }
}

interface AA{
    int i = 100;
    
    default void machWasAnderes(){
        System.out.println(i);
    }
}


interface BB{
    int i = 200;
    
    static void machWasAnderes(){
        System.out.println(i);
    }    

}


class CC implements AA, BB{
    int i = 300;

    void machWas(){
        System.out.println(i);
    }
}
