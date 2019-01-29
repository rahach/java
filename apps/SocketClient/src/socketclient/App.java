package socketclient;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Scanner;

public class App {

    private Socket socket;
    
    private final Scanner scanner;
 
    App() throws IOException{
        scanner = new Scanner(System.in);
        socket = new Socket("localhost", 8888);
    }
    
    public static void main(String[] args) {

        System.out.println("START CLIENT...");
        try{
            new App().start();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("END CLIENT...");
    }    
    
    void start() throws IOException{

        String input;        

        PrintWriter writer = new PrintWriter(socket.getOutputStream());

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        
        while(true){
            input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("exit"))
                break;
            writer.println(input);
            writer.flush();
            
            oos.writeObject(new Message(LocalDate.now(), "hi", input));
            oos.flush();
            
        }        
    }    
}