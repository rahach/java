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
public class Inheritance4 {

    public static void main(String[] args) {
        Anim a = new Goat();
        Anim a1 = new Anim();
        a1.eat("h");

        
        Goat g = (Goat) a;        
        g.eat("e");

    }   
}

class Anim {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Anim {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
  public void eat(String str) {
        System.out.println("another");
  }
}

