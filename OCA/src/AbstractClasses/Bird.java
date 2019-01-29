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
public abstract class Bird extends Animal{

    public static String CLASS_NAME = "Bird";
    
    public abstract String getHabitat();

    public String getIntroduction(){
        return "Welcome to the bird class";
    }

    public int getNumFeet(){
        return 2;
    }
    
    
}