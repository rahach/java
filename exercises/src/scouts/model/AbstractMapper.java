/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scouts.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2923201
 */
public abstract class AbstractMapper<T extends AbstractEntity> {
    
    public final String TABLE;
    
    public AbstractMapper(String tbl){
        TABLE = tbl;
    }
    
    public T find(int id) throws SQLException {

        String sql = "SELECT * FROM " + TABLE + " WHERE id = " +id;

        try(Connection dbh = null; Statement stmt = dbh.createStatement()){
            ResultSet results = stmt.executeQuery(sql);
            if(results.next())
                return create(results);
        }        
        return null;
    }    
            
    public List<Scout> find() throws SQLException{
        String sql = "SELECT * FROM " + TABLE;
        List<Scout> list = new ArrayList<>();
        try(Connection dbh = null; Statement stmt = dbh.createStatement()){
            ResultSet results = stmt.executeQuery(sql);
            while(results.next()){
                list.add(create(results));
            }
        }        
        return list;
    }
    
    

    public final boolean save(T obj){
        if(obj.getId()>0){
            return update(obj);
        } 
        else{
            return insert(obj);
        }
    }
    
    protected abstract boolean insert(T obj);
    
    protected abstract boolean update(T obj);
    
    public abstract boolean delete(T obj); 
    
    public abstract boolean delete(int id);

    protected abstract T create(ResultSet result) throws SQLException;

    
}