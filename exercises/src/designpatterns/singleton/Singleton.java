/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.singleton;


import java.sql.Connection;
/**
 *
 * @author 2923201
 */
public class Singleton {       
    public static void main(String[] args) {
        LazySingletonImpl lazy = LazySingletonImpl.getInstance();
        EagerSingletonImpl eager = EagerSingletonImpl.getInstance();        
    }    
}

//LAZY
class LazySingletonImpl{

    private static LazySingletonImpl instance;
    
    private LazySingletonImpl(){ };
    
    public static LazySingletonImpl getInstance(){
        
        if(instance == null){
        
            instance = new LazySingletonImpl();
        }    
        return instance;        
    }    
}

//EAGER
class EagerSingletonImpl{
    private static EagerSingletonImpl instance = new EagerSingletonImpl();
    
    private EagerSingletonImpl(){ };
    
    public static EagerSingletonImpl getInstance(){
        return instance;        
    }        
}

class DBManager{
    private static DBManager instance;
    private Connection conn;
    
    private DBManager(){
        //Aufbau der DB Verbindung
        //conn = ...        
    }
        
    public static Connection getConnection(){
        if(instance == null){
            instance = new DBManager();
        }
        return instance.conn;
    }   
}

