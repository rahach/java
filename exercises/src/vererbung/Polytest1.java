/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung;

/**
 *
 * @author 2923201
 */
public class Polytest1 {

    public static void main(String[] args) {
        
        Polytest1 obj = new Polytest1();
        obj.machWas(new Food());

        System.out.println("------------------------");
        obj.machWas(new Tool());        
             
    }

    public void machWas(Thing t){
        t.use();
    }
    
}


abstract class Thing{
    
    public abstract void use();

}

class Tool extends Thing{
    
    @Override
    public void use(){
        System.out.println("Benutze Werkzeug.");
    }
    
}

class Food extends Thing{
    
    @Override
    public void use(){
        System.out.println("Esse Mittagessen.");
    }
    
}




