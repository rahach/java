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
public class Inheritance3 {
    public static void main(String[] args) {


        
        m2();
        
    }

    static O m1(){
        return new O();
    }

    static P m2(){
        
        //P p1 = (P)m1();
        P p2 = new P();

        O o1 = new O();
        
        P p3 = (P)o1;
        return p3;
    }


}


class O{
    void test(){};
}

class P extends O{
    void test(){}
}