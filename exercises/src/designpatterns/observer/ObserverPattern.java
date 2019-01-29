/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
/**
 *
 * @author 2923201
 */
public class ObserverPattern{
      
    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();
        Scanner scanner = new Scanner(System.in);
        
        board.addObserver(new JobNews());
        board.addObserver(new WirtschaftsNews());
        board.addObserver(new PolitikNews());        
        
        while(true){
            System.out.println("Typ: ");
            String typ = scanner.nextLine();
            
            if(typ.equalsIgnoreCase("exit"))
                break;
            
            System.out.println("Nachricht: ");
            String message = scanner.nextLine();
            
            board.setMessage(typ, message);
        }
    }   
}



class MessageBoard extends Observable{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message, String messageBody) {
        this.message = message;
        setChanged();
        notifyObservers(messageBody);
    }
    
}

class WirtschaftsNews implements Observer{
    
    @Override
    public void update(Observable o, Object arg){
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()){
            case "wirtschaft":
                System.out.println("WN: " + arg);
                break;
            default:
                System.out.println("WN: interessiert uns nicht");
        }
    }    
}

class PolitikNews implements Observer{
    
    private int exitCount = 0;    
    
    @Override
    public void update(Observable o, Object arg){
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()){
            case "politik":
                System.out.println("PN: " + arg);
                break;
            default:
                System.out.println("PN: interessiert uns nicht");
                exitCount++;
        }
        
        if(exitCount == 3){
            o.deleteObserver(this);
        }            
    }    
}

class JobNews implements Observer{
       
    @Override
    public void update(Observable o, Object arg){
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()){
            case "jobs":
                System.out.println("J: " + arg);
                break;
            case "freelance":
                System.out.println("F: " + arg);
                break;                
            default:
                System.out.println("J: interessiert uns nicht");
        }
    }    
}

