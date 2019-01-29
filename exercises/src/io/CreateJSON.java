/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author 2923201
 */
public class CreateJSON {
    
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("name", "Cities");
        
        JSONArray jsonArr = new JSONArray();
        
        jsonArr.add("Hamburg");
        jsonArr.add("Berlin");        
        jsonArr.add("Paris");                
        jsonArr.add("London");                        

        json.put("cities", jsonArr);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("json_data.json"))){
            bw.write(json.toJSONString());
            bw.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }  
}
