/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Interfaces;

/**
 *
 * @author raik
 */
public class Interfaces2 implements T3{

    @Override
    public void m1() {
        System.out.println("m1");;
    }

    @Override
    public void m1(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void m1(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Interfaces2 int2 = new Interfaces2();
        System.out.println(int2.VALUE);
        System.out.println(((T2) int2).VALUE);        
    }    
}

interface T1{
   int VALUE = 10;    
   void m1(int x, int y);
}

interface T2 extends T1{
   int VALUE = 20;
   void m1();
}

interface T3 extends T2{
   int VALUE = 30;
   void m1();
   void m1(int x);
}