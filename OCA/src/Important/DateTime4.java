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
public class DateTime4 {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2015-02-05", f);
        LocalTime time = LocalTime.parse("10:22");
        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(date);
        System.out.println(time);
        System.out.println(ldt);        
    }
}
