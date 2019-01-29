package Important.Inheritance.Hiding;

public class InheritanceTest1 {
    public static void main(String[] args) {
        Mammal m = new Mammal();                
        System.out.println(Mammal.breathe());
        System.out.println(Mammal.breathe());

        System.out.println(Animal.breathe());        
    }
}

class Animal{
    public static String breathe(){
        return "Animal breathing...";
    }    
        
    public void queryAnimal(){
        System.out.println(breathe());
    }
} 

class Mammal extends Animal{
    public static String breathe(){
        return "Mammal breathing...";
    }   
    
    public void queryMammal(){
        System.out.println(breathe());
    }    
}