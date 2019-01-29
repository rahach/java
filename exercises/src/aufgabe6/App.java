package aufgabe6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raik
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        DateTimeClass dtc = new DateTimeClass();
        
        List<DateTimeClass> l1 = new ArrayList<>();
        while(true){
            System.out.println("Willkommen beim Termin Kalender: ");
            System.out.println("Bitte Aktion wählen: save(Termin speichern) oder show(alle Termin anzeigen)");            
            String action = scanner.nextLine();
            if(action.equalsIgnoreCase("exit"))
                break;
            



           if(action.equalsIgnoreCase("save")){
                System.out.println("Datum eingeben: Format(dd.MM.yyyy_hh:mm)");                
                String date = scanner.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH:mm");
                LocalDateTime dateTime = LocalDateTime.parse(date, formatter);                
                dtc.setLdt(dateTime);
                
                System.out.println("Title eingeben: ");                
                String title = scanner.nextLine();
                dtc.setTitle(title);
                
                System.out.println("Beschreibung eingeben: ");                
                String description = scanner.nextLine();    
                
                l1.add(dtc);
            }

                
                
            if(action.equalsIgnoreCase("show")){

                l1.forEach(                                      );
            }            
        }                
    }
}
