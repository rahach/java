/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author raik
 */
public class DateTime2 {
    
    public static void main(String[] args) {
    
        LocalDate date = LocalDate.of(2018, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(0, 0);
        LocalDateTime ldt = LocalDateTime.of(date, time);
        
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));        
        
    }    
}
