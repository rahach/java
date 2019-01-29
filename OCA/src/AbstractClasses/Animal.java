/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

/**
 *
 * @author raik
 */

abstract class LivingBeing{     }

public abstract class Animal extends LivingBeing {
    
    
    
    private int x = 0;
    
    public static String CLASS_NAME;
    
    static { CLASS_NAME = Class.class.getSimpleName(); };//Animal.class.getSimpleName(); }
    
    
    public abstract String getName();

    public String getIntroduction(){
        return "Welcome to the animal class";
    }
    
    public abstract int getNumFeet();
    
    
    public static void main(String[] args) {


        System.out.println(Animal.CLASS_NAME);                        
        System.out.println(Bird.CLASS_NAME);                        
        System.out.println(Seagull.CLASS_NAME);                                

        Seagull seagull = new Seagull();

        System.out.println(seagull.getIntroduction());
        System.out.println(seagull.getName());
        System.out.println(seagull.getHabitat());        
        System.out.println(seagull.getNumFeet());                

        
        Pigeon pigeon = new Pigeon();

        System.out.println(pigeon.getIntroduction());
        System.out.println(pigeon.getName());
        System.out.println(pigeon.getHabitat());        
        System.out.println(pigeon.getNumFeet());                        
        
    }


}





