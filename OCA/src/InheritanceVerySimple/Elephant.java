/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceVerySimple;

/**
 *
 * @author raik
 */
public class Elephant extends Mammal{
    
    private String familyName = "Jumbos";
    
    public Elephant(int age){
        super(age);
        this.size = 4;
    }
    
    public Elephant(){
        this(6);
    }
    

    public static void main(String[] args) {
        new Elephant().displayAnimalDetails();
    }

    public void displayAnimalDetails(){
        System.out.println("Family Name: " + familyName);
        System.out.println("Size: " + size);        
        System.out.println("Age: " + getAge());                
    }
    
    public void printAge(){
        System.out.println("Age: " + super.getAge());                        
    }
    
    public void printSize(){
        System.out.println("Size: " + this.size);                        
    }    
    
}
