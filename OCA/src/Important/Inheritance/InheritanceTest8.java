/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Inheritance;

/**
 *
 * @author raik
 */
class X{
    public X(){
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(){
        super();
        System.out.println("In Y");
    }
}

class Z extends Y{
    public Z(){
        System.out.println("In Z");
    }
}

public class InheritanceTest8 {

    public static void main(String[] args) {
        X x = new Z();
    }
}
