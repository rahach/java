package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {
 
    public static void main(String[] args) {
        
        JSONParser parser = new JSONParser();
        try(BufferedReader br = new BufferedReader(new FileReader("json_data.json"))){

            
            JSONObject json = (JSONObject)parser.parse(br);
            System.out.println(json.get("name"));
            
            JSONArray arr = (JSONArray)json.get("cities");
            arr.forEach(c->System.out.println(c));
            
        }
        catch(IOException | ParseException e){
            e.printStackTrace();
        }        
    }
}