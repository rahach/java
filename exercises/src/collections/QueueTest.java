/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author 2923201
 */
public class QueueTest {

    private static final Queue<String> q = new LinkedList<>();
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        String input = "";
        
        while(true){
            
            while(!input.equals("exit")){            
                input = s.next();            
                q.offer(input);                        
            }
            input = "";
            
            System.out.println("AUSGABE:");
            String str = null;
            
            while((str = q.poll()) != null)
                System.out.println(str);
/*            
            q.add("Peter");
            q.offer("Peter");        
            q.offer("Clark");                    
*/
        }
    }
}
