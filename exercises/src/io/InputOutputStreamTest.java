/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author 2923201
 */
public class InputOutputStreamTest {
    
    public static void main(String[] args) {

        Instant start = Instant.now();

        
        
        
        try(InputStream is =  new FileInputStream("test/subdir/Arbeitsblatt1.pdf"); 
                BufferedInputStream bis = new BufferedInputStream(is);                
                OutputStream os = new FileOutputStream("test/subdir/Arbeitsblatt2.pdf");
                BufferedOutputStream bos = new BufferedOutputStream(os);                                
                ){
            int data;
            while((data = bis.read()) != -1){
                bos.write(data);
            }
            
            bos.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }        
        
        Instant stop = Instant.now();        
        
        
        System.out.println(Duration.between(start, stop).getNano());
        
    }
    
    
}
