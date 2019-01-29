/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.io.IOException;

/**
 *
 * @author raik
 */
public class Exception2 {
    public static void main(String[] args) throws IOException{
        try {
            PortConnector pc = new PortConnector(10);
        } catch (IOException e) {
            throw new IOException();
        }
    }    
}

class PortConnector {

    public PortConnector(int port) throws IOException{
        if (Math.random() > 0.5) {

        }

        throw new RuntimeException();
    }
}