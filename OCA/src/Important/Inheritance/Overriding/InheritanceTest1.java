package Important.Inheritance.Overriding;

public class InheritanceTest1 {
    public static void main(String[] args) {
        Mammal m = new Mammal();                
        m.queryAnimal();
        m.queryMammal();

        Animal a = new Mammal();                
        a.queryAnimal();        
    }
}

class Animal{
    public String breathe(){
        return "Animal breathing...";
    }    
        
    public void queryAnimal(){
        System.out.println(breathe());
    }
} 

class Mammal extends Animal{
    public String breathe(){
        return "Mammal breathing...";
    }   
    
    public void queryMammal(){
        System.out.println(breathe());
    }    
}