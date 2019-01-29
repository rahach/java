/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.Interfaces;

/**
 *
 * @author raik
 */
public class Interfaces5 {
    public static void main(String[] args) {
        Jump[] eJump1 = { null, new Animal() };   

        Jump[] eJump2 = new Animal[4];

        Jump[] eJump3 = new Jump[4];        

        Jump j = new Animal();

    }

}


interface Jump {}
class Animal implements Jump {}