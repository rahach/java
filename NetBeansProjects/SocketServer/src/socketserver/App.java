package socketserver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App {

    private ServerSocket server;
    
    App(){
        try{
            server = new ServerSocket(8888);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());            
        }
    }

    
    public static void main(String[] args) {
        App serverApp = new App();
        
        System.out.println("START...");

        try{
            serverApp.listen();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("END...");
    }
    
    private void listen() throws IOException {
        
        Socket client = server.accept();
        String ip = client.getInetAddress().getHostAddress();
        System.out.printf("Verbindung zu %s aufgebaut%n", ip);
/*        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(client.getInputStream()));
        
        String line;
        while((line = reader.readLine()) != null){
            System.out.printf("IP %s: %s", ip, line);
        }    
*/              
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(client.getInputStream()));
        
        Object o;
        
        try{
            while((o = ois.readObject()) != null){
                Message m = (Message)o;
                System.out.printf("IP %s: %s%n", ip, m.getDate() + ", " + m.getBody());
            }
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }    
}
