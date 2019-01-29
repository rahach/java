/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceOverriding;

/**
 *
 * @author raik
 */
public class Deer {
    
    public Deer(){
        System.out.print("Deer");
    }
    
    public Deer(int age){
        System.out.print("DeerAge");
    }
    
    public boolean hasHorns(){
        return false;
    }
    
    public static void main(String[] args) {
        
        Deer deer = new Reindeer(5);
        System.out.print(", " + deer.hasHorns());
    }
}


class Reindeer extends Deer{

    public Reindeer(int x){
        System.out.print("Reindeer");
    }
    
    public boolean hasHorns(){
        return true;
    }   
    
}