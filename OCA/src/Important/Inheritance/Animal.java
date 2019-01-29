/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Inheritance;

/**
 *
 * @author raik
 */
    
interface Movable{ 
   int offset = 100; 
   public void move(int dx);
}
interface Growable{
  public void grow(int dy);
}

class Animal implements Movable, Growable{
   public void move(int dx){ }
   public void grow(int dy){ }
}