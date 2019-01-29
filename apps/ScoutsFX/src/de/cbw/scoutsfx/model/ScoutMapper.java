package de.cbw.scoutsfx.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T.Lubowiecki
 */
public class ScoutMapper extends AbstractMapper<Scout>{

    public ScoutMapper() {
        super("scouts");
    }
    
    @Override
    protected boolean insert(Scout obj) throws SQLException {
        String sql = "INSERT INTO " + TABLE + 
                " (firstname, lastname, birthdate)" +
                " VALUES(?, ?, ?)";
        
        try(Connection dbh = DBManager.getConnection(); 
                PreparedStatement stmt = dbh.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, obj.getFirstName());
            stmt.setString(2, obj.getLastName());
            stmt.setDate(3, Date.valueOf(obj.getBirthDate()));
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            int id = rs.next() ? rs.getInt(1) : 0;
            
            if(id > 0) {
                obj.setId(id);
                return true;
            }
            return false;
        }
    }

    @Override
    protected boolean update(Scout obj) throws SQLException {
        
        String sql = "UPDATE " + TABLE + " SET " +
                "firstname = ?, " +
                "lastname = ?, " + 
                "birthdate = ? " + 
                "WHERE id = ? LIMIT 1";
        
        try(Connection dbh = DBManager.getConnection(); 
                PreparedStatement stmt = dbh.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getFirstName());
            stmt.setString(2, obj.getLastName());
            stmt.setDate(3, Date.valueOf(obj.getBirthDate()));
            stmt.setInt(4, obj.getId());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    protected Scout create(ResultSet result) throws SQLException {
        Scout scout = new Scout();
        scout.setId(result.getInt("id"));
        scout.setFirstName(result.getString("firstname"));
        scout.setLastName(result.getString("lastname"));
        scout.setBirthDate(result.getDate("birthdate").toLocalDate());
        return scout;
    }
}
