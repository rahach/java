/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 2923201
 */
public class VererbungTest1 {
    
    class SuperClass{
        
        public SuperClass(){
            System.out.println(SubClass.class.getName());
        }
        
        
    }
    
    
    class SubClass extends SuperClass{
        
        public SubClass(){

            System.out.println(SubClass.class.getName());
        }
        
    }
    
    
    interface IKommunikativ extends Serializable{
        void machWas();
    }
    
    class SehrKommunikativeKlasse implements IKommunikativ{

        @Override
        public void machWas(){
            
        }
    }
    
}
