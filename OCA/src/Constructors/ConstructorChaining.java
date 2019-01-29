/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

/**
 *
 * @author raik
 */
public class ConstructorChaining {
        
    public static void main(String[] args) {
        Mouse mouse = new Mouse(55, 7, 1);
        System.out.println(mouse.getWeight() + ", " + mouse.getNumTeeth() + ", " + mouse.getNumWhiskers());
    }
}

class Mouse{
    
    private int numTeeth;
    private int weight;    
    private int numWhiskers;    
    
    public Mouse(int weight){
        this(weight, 16);
    }

    public Mouse(int weight, int numTeeth){
        this(weight, numTeeth, 6);        
    }

    public Mouse(int weight, int numTeeth, int numWhiskers){
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;                
    }    

    public int getNumTeeth() {
        return numTeeth;
    }

    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumWhiskers() {
        return numWhiskers;
    }

    public void setNumWhiskers(int numWhiskers) {
        this.numWhiskers = numWhiskers;
    }



    
}