package de.cbw.scoutsfx.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public abstract class DBManager {
    
    private final static Properties config = new Properties();
    private final static String CONFIG_FILE = System.getProperty("user.home") + "/config.properties";
    private final static String CONNECTION_URL;
    
    static {
        try(FileInputStream fis = new FileInputStream(CONFIG_FILE)) {
            config.load(fis);
        }
        catch(FileNotFoundException ex) {
            createConfigFile();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("jdbc:mysql://")
          .append(config.getProperty("host", "localhost"))
          .append(":")
          .append(config.getProperty("port", "3306"))
          .append("/")
          .append(config.getProperty("dbname"));
        
        CONNECTION_URL = sb.toString();
    }
    
    public static void init() {
    }
    
    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_URL, config);
    }
    
    private static void createConfigFile() {
        
        System.out.println("Es wurde keine Konfiguration gefunden.");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Host: ");
        config.setProperty("host", input.nextLine());
        System.out.println();
        
        System.out.print("Port: ");
        config.setProperty("port", input.nextLine());
        System.out.println();
        
        System.out.print("Datenbankname: ");
        config.setProperty("dbname", input.nextLine());
        System.out.println();
        
        System.out.print("User: ");
        config.setProperty("user", input.nextLine());
        System.out.println();
        
        System.out.print("Passwort: ");
        config.setProperty("password", input.nextLine());
        System.out.println();
        
        try(FileOutputStream fos = new FileOutputStream(CONFIG_FILE)) {
            config.store(fos, null);
            System.out.println("Konfiguration wurde gespeichert!");
        }
        catch(IOException ex) {
            System.out.println("Fehler beim speichern der Konfiguration!");
        }
    }
}
