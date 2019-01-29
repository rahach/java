/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author 2923201
 */
public class IOTest1 {
    
    public static void main(String[] args) {
        File d = new File("test/subdir");
        File f = new File(d, "test1.txt");        
        try{
            if(!d.exists()){
                d.mkdirs();                
                System.out.println("Verzeichnisse wurden angelegt");
            }
            if(!f.exists()){
                f.createNewFile();
                System.out.println("Datei wurde erzeugt");
            }
            /*
            System.out.println(f.getAbsolutePath());
            f.delete();
            
            //new File("test/subdir").delete();
            //new File("test").delete();            
            Arrays.stream(new File("src").list())
                    .filter(s->s.endsWith("a"))
                    .forEach(System.out::println);
            */
            

            InputStream fis = new FileInputStream(f);

            System.out.println(fis.available());

            int data;
            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }

            if(fis != null)
                fis.close();

            OutputStream fos = new FileOutputStream(f);

            String s = "Hallo Welt";
            
            fos.write(s.getBytes());

            
            FileOutputStream fos2 = new FileOutputStream(f, true);

            String s2 = "Hallo Welt";
            
            fos.write(s2.getBytes());            
            
            
        }
        catch(IOException ex){
            ex.printStackTrace();
        }        
    }    
}
