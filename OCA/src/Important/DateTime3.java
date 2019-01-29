/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important;

import java.time.*;
import java.time.format.*;


/**
 *
 * @author raik
 */
public class DateTime3 {
    
    public static void main(String[] args) {
    
        LocalDate date = LocalDate.of(2018, 1, 1);
        LocalTime time = LocalTime.of(11, 12, 13);
        LocalDateTime ldt = LocalDateTime.of(date, time);
        
        System.out.println(ldt);

        DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(shortDateTime1.format(ldt));
        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);        
        System.out.println(shortDateTime2.format(date));        
        DateTimeFormatter shortDateTime3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);        
        System.out.println(shortDateTime3.format(time));

        DateTimeFormatter shortDateTime4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortDateTime4.format(ldt));
        DateTimeFormatter shortDateTime5 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);        
        System.out.println(shortDateTime5.format(date));        
        DateTimeFormatter shortDateTime6 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);        
        System.out.println(shortDateTime6.format(time));        

    }    
}
