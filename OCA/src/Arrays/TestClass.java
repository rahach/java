/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author raik
 */
public class TestClass{
   public static void main(String args[]){

       int[][] a = new int[2][];

        a[0] = new int[1];
        a[1] = new int[1];       
       
        a[0][0] = 1;

//        a[1][0] = 3;
//        a[1][1] = 4;
//        a[1][2] = 5;
//        a[1][3] = 6;       

        System.out.println(a[0][0]);
//        System.out.println(a[1][0]);
       
        TestClass tc = new TestClass();
                
        tc.switchTest((byte)100);
        tc.test();
        
        NewTestClass ntc = new NewTestClass();
        ntc.switchTest((byte)100);

        
        ntc.test2(new String[]{"a", "b", "c"}, "d", "e", "f");        

        ntc.test2(new String[]{"a", "b", "c"}, new int[] {1, 2, 3, 4});        

        ntc.test2(new String[]{"a", "b", "c"}, new int[] {1, 2, 3, 4}, 1, 2, 3);        

        ntc.test2(new String[]{"a", "b", "c"}, new int[] {1, 2, 3, 4}, new int[2]);        

        
        tc = ntc;
        tc.switchTest((byte)100);
   }
   
    void switchTest(byte x){
       switch(x){
          case 'b':  System.out.println("1"); break; // 1
          default : System.out.println("def"); break;  // 2
          case -2:  System.out.println("-2"); break;  // 3
          case 80:  System.out.println("80"); break;  // 4
       }
    }   
   
    
    final void test(){
        System.out.println("test");
    }
    

    
}

class NewTestClass extends TestClass{
    
    void switchTest(byte x){
        System.out.println("overridden");
    }
    
    void test2(String[] arg, String... arg2){
        for(String s: arg)
            System.out.println(s);

        for(String s: arg2)
            System.out.println(s);        
        
    }

    void test2(String[] arg, int[] arg2){
        for(String s: arg)
            System.out.println(s);

        for(int i: arg2)
            System.out.println(i);        
        
    }    
    

    void test2(String[] arg, int[] arg2, int... i){
        for(String s: arg)
            System.out.println(s);

        for(int ii: arg2)
            System.out.println(ii);        

        for(int iii: i)
            System.out.println(iii);        
        
    }    

    
//    void test(){
//        System.out.println("test");
//    }    
    
}