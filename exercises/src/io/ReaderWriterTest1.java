/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.time.Duration;
import java.time.Instant;


/**
 *
 * @author 2923201
 */
public class ReaderWriterTest1 {

    public static void main(String[] args) {
        
        Instant start = Instant.now();        
        
        try(Reader r = new FileReader("test/subdir/Test1.txt"); 
                BufferedReader br = new BufferedReader(r);
                Writer w = new FileWriter("test/subdir/Test2.txt");
                BufferedWriter bw = new BufferedWriter(w);
                ){
            int data;
            while((data = br.read()) != -1){
                bw.write(data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        Instant stop = Instant.now();        
        
        System.out.println(Duration.between(start, stop).getNano());        
    }    
}
