/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author raik
 */
public class DateTimeClass {

    private LocalDateTime ldt;

    private String title;
    
    private String description;

    public String getLdt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH:mm");                        
        String formattedString = ldt.format(formatter);                
        return formattedString;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
