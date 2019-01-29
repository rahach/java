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
public class Arrays {

    public static void main(String[] args) {



        int[][] a = new int[2][4];
        
            a[0][0] = 1;
            a[0][1] = 2;


            a[1][0] = 3;
            a[1][1] = 4;
            a[1][2] = 5;
            a[1][3] = 6;        
        

        for(int[] i:a)    
            for(int j:i)
                System.out.println(j);            
            
            
            
//        int[][] b = new int[2][];
//        
//            b[0][0] = 1;
//            b[0][1] = 2;
//
//
//            b[1][0] = 3;
//            b[1][1] = 4;
//            b[1][2] = 5;
//            b[1][3] = 6;                    
            


        int[][] c = new int[2][];
        c[0] = new int[2];
        c[1] = new int[4];
        
            c[0][0] = 1;
            c[0][1] = 2;


            c[1][0] = 3;
            c[1][1] = 4;
            c[1][2] = 5;
            c[1][3] = 6;                    

        for(int[] i:c)    
            for(int j:i)
                System.out.println(j);
        
        
        
        boolean[] b = new boolean[2];
        
        for(boolean bool:b)
            System.out.println(bool);
        
        
    }

    
}
