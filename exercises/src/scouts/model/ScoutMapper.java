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
public class ScoutMapper extends AbstractMapper<Scout> {

    public ScoutMapper(){
        super("scouts");
    }
        
    @Override
    public Scout find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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

    
    
    
    @Override
    protected boolean insert(Scout obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean update(Scout obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Scout obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Scout create(ResultSet result) throws SQLException{
        Scout scout = new Scout();
        scout.setId(result.getInt("id"));
        scout.setLastName(result.getString("lastname"));        
        scout.setFirstName(result.getString("firstname"));                
        scout.setBirthDate(result.getDate("birthdate").toLocalDate());                        
        return scout;
    }
    

    
}
