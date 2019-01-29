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
public class DateTime1 {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse("2015-02-05", f);
        LocalDateTime d2 = LocalDateTime.of(2015, 2, 5, 0, 0, 0);
        LocalDateTime d3 = LocalDateTime.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);        
        
        
        
    }
}
