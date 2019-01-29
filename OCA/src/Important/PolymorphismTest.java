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
public class PolymorphismTest {

   public static void main(String[] args){
       

       
      AA a = new BB();
      a.print();
      
       AA[][][] aa = {{{a,a}},{{a,a,a}}};

      
      double f = 4e2;
       System.out.println(f);
       
      double f1 = 4e-1;
       System.out.println(f1);       
       
       System.out.println(a);
       System.out.println(aa);       
       
       String s = "8";
       f = Float.valueOf(s).floatValue();
       f = Float.NaN ;
       System.out.println(f);
   }    

}
    
class AA{
   AA() {  print();   }
   void print() { System.out.println("A"); }

}

class BB extends AA{
   int i =   4;
   int ii = 6;
   void print() { System.out.println(ii); }    


}
