/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scouts;

import scouts.model.Scout;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author 2923201
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    private static final String KEYS = 
              "\n*********************************************"
            + "\n* new: neuer Scout"
            + "\n* list: alle Scouts anzeigen"
            + "\n* edit: einen Scout bearbeiten"
            + "\n* delete: einen Scout löschen"
            + "\n* exit: Programm verlassen"
            + "\n*********************************************\n\n";

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    
    private static final String DATA_FILE = "data.ser";
    
    private static final Scanner input = new Scanner(System.in);    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        boolean exit = false;    

        Scanner input = new Scanner(System.in);
        
        Scout[] scouts = new Scout[10];  
        
        while(!exit){
            
            System.out.println(KEYS);
            
            String text = input.next();

            //CRUD, BREAD            
            
            if(text.equalsIgnoreCase("new")){
                int pos;
                if((pos = getNextFreeIndex(scouts)) == -1){
                    System.out.println("Sorry! Liste ist voll.");                    
                } else{    
                    Scout scout = new Scout();
                    System.out.print("Vorname: ");
                    scout.setFirstName(input.next());

                    System.out.print("Nachname: ");
                    scout.setLastName(input.next());
    // strg+shift+c
    //                System.out.print("Geburtsdatum: ");
    //                scout.setBirthDate(input.next());
                    scouts[pos] = scout;                
                }    
            }else if(text.equalsIgnoreCase("list")){

                for(int i = 0; i < scouts.length; i++){
                   System.out.println(scouts[i]);                                       
                }
                
            }else if(text.equalsIgnoreCase("edit")){
                System.out.println("Scout bearbeiten: EDIT");
            }else if(text.equalsIgnoreCase("delete")){
                System.out.println("Scout löschen: DELETE");                
            }else if(text.equalsIgnoreCase("exit")){
                exit = true;
            }else{
                System.out.println("Ungültige Eingabe");                
            }
        }        
    }    
    
    private static int getNextFreeIndex(Scout[] scout){
        for(int i = 0; i < scout.length; i++){
            if(scout[i] == null){
                return i;
            }
        }
        return -1;
    }
        
}
