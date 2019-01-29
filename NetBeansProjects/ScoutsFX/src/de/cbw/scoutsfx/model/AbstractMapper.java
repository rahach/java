package de.cbw.scoutsfx.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T.Lubowiecki
 */
public abstract class AbstractMapper<T extends AbstractEntity> {
    
    public final String TABLE;

    public AbstractMapper(String tbl) {
        TABLE = tbl;
    }
    
    public T find(int id) throws SQLException {
        String sql = "SELECT * FROM " + TABLE + " WHERE id = " + id;
        
        try(Connection dbh = DBManager.getConnection(); Statement stmt = dbh.createStatement()) {
            ResultSet results = stmt.executeQuery(sql);
            if(results.next())
                return create(results);
            
            return null;
        }
    }
    
    public List<T> find() throws SQLException {
        String sql = "SELECT * FROM " + TABLE;
        List<T> list = new ArrayList<>();
        try(Connection dbh = DBManager.getConnection(); Statement stmt = dbh.createStatement()) {
            ResultSet results = stmt.executeQuery(sql);
            while (results.next()) {
                list.add(create(results));
            }
        }
        return list;
    }
    
    public final boolean save(T obj) throws SQLException {
        if(obj.getId() > 0) {
            return update(obj);
        }
        else {
            return insert(obj);
        }
    }
    
    protected abstract boolean insert(T obj) throws SQLException;
    
    protected abstract boolean update(T obj)  throws SQLException;
    
    public boolean delete(T obj) throws SQLException {
        return delete(obj.getId());
    }
    
    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM " + TABLE + " WHERE id = " + id;
        
        try(Connection dbh = DBManager.getConnection(); Statement stmt = dbh.createStatement()) {
            return stmt.executeUpdate(sql) > 0;
        }
    }
    
    protected abstract T create(ResultSet result) throws SQLException;
}
