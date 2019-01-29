package socketclient;

import java.io.Serializable;
import java.time.LocalDate;

public class Message implements Serializable{

    private final LocalDate date;
    private final String head;
    private final String body;        
    
    public Message(LocalDate date, String head, String body) {
        this.date = date;
        this.head = head;
        this.body = body;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }
}