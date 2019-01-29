/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Polymorphism;
/**
 *
 * @author raik
 */
public class Test1 {
static int i;

  public static void main(String[] args){
    Y y = new Y();
    X x = new X();
    int k = x.val;
    int l = y.val;
    System.out.println("k: "+k);
    System.out.println(x.getInt());
    System.out.println("l: "+l);
    System.out.println(y.getInt());
    
    x = y;
    int m = x.val;
    System.out.println("m: "+m);    
    System.out.println(x.getInt());
    
    y = (Y)x;
    int n = y.val;
    System.out.println("n: "+n);        
    System.out.println(y.getInt());    
  }

}

class X{
    int val = 10;
    
    public int getInt(){
        return 1000;
    }
}

class Y extends X{
    int val = 0; //1

    public int getInt(){
        return 111;
    }
}

