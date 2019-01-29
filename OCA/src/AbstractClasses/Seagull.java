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
public class Seagull extends Bird{

    public static String CLASS_NAME = "Seagull";    
    
    @Override
    public String getHabitat() {
        return "shore";
    }

    @Override
    public String getName() {
        return "seagull";
    }
    
    public String getIntroduction(){
        return "Welcome to the seagull class";
    }
    
    
}