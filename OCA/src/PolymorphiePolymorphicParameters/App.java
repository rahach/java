/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphiePolymorphicParameters;

/**
 *
 * @author raik
 */
public class App {
    public static void main(String[] args) {
        ZooWorker worker = new ZooWorker();
        worker.feed(new Reptile());
        worker.feed(new Alligator());
        worker.feed(new Crocodile());        
    }
}
