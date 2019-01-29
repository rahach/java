package scouts;

import scouts.model.Scout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2923201
 */
public abstract class ViewHelper {
    
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    
    public static String printAsTable(List<Scout> scouts) {
        
        String row = "%6s | %10s | %10s | %10s | %6s\n";
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(row, 
                "ID", "FIRSTNAME", "LASTNAME", "BIRTHDATE", "ACTIVE"));
        sb.append("---------------------------------------------------------------------\n");
        
        scouts.forEach((s) -> {
            sb.append(String.format(row, 
                s.getId(), s.getFirstName(), s.getLastName(), 
                DATE_FORMAT.format(s.getBirthDate()), 
                s.isActive() ? "ja" : "nein"));
        });
        
        sb.append("---------------------------------------------------------------------\n");
        
        return sb.toString();
    }
    
    public static Scout populate(Scanner input, Scout s) {
        
        System.out.println("Neu!");
        
        System.out.print("Vorname: ");
        s.setFirstName(input.nextLine());

        System.out.print("Nachname: ");
        s.setLastName(input.nextLine());

        while(true) {
            System.out.print("Geburtsdatum: ");
            try {
                s.setBirthDate(LocalDate.parse(input.nextLine(), DATE_FORMAT));
                break;
            }
            catch(DateTimeParseException e) {
                System.out.println("Falsches Format!");
            }
        }
        
        while(true) {
            System.out.print("Aktiv (j|n): ");
            String active = input.nextLine();
            // TODO: Auf switsch umstellen
            if(active.equalsIgnoreCase("j")) {
                s.setActive(true);
                break;
            } else if(active.equalsIgnoreCase("n")) {
                s.setActive(false);
                break;
            }
            System.out.println("Falsche Eingabe!");
        }
        
        return s;
    }
}
