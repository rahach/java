/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Important.APIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;
/**
 *
 * @author raik
 */
public class DateTimeFormatterTest {

    private static DateTimeFormatter ISO_DATE_TIME;


    public static void main(String[] args) {
        LocalDateTime d1;
        d1 = LocalDateTime.parse("2007-12-03T10:15:30", DateTimeFormatter.ISO_DATE_TIME);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);        
        
    }
    

}

