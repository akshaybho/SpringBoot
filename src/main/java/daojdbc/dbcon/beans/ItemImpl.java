package daojdbc.dbcon.beans;

import daojdbc.dbcon.DbConnection;
import daojdbc.dbcon.product.Items;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemImpl implements Item{


    @Override
    public boolean addDetails(Items it) {

        boolean status = false;
        try
        {
           Connection con = DbConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO items VALUES(?,?,?)");
            ps.setInt(1, it.getId());
            ps.setString(2, it.getItem());
            ps.setInt(3, it.getPrice());
            int count = ps.executeUpdate();

            if(count>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        } catch (SQLException e) {

            status = false;
            throw new RuntimeException(e);
        }
        return status;
    }
}
