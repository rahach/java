package de.cbw.scoutsfx.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author T.Lubowiecki
 */
public class CampMapper extends AbstractMapper<Camp>{

    public CampMapper() {
        super("camps");
    }

    @Override
    protected boolean insert(Camp obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean update(Camp obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Camp create(ResultSet result) throws SQLException {
        Camp camp = new Camp();
        camp.setId(result.getInt("id"));
        camp.setName(result.getString("name"));
        camp.setLocation(result.getString("location"));
        camp.setDescription(result.getString("description"));
        return camp;
    }
}
