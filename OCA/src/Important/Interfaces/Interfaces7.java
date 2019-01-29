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

interface Jumpable {
    int height = 1;
    default void worldRecord() {
        System.out.print(height);
    }
}

interface Moveable {
    int height = 2;
    static void worldRecord() {
        System.out.print(height);
    }
}

public class Interfaces7 implements Jumpable, Moveable {
    int height = 3;
    Interfaces7() {
        worldRecord();
    }
    public static void main(String args[]) {
        Jumpable j = new Interfaces7();
        Moveable m = new Interfaces7();
        Interfaces7 c = new Interfaces7();
    }
}