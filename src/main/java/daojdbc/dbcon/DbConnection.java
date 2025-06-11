package daojdbc.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    static Connection con;
    static String url = "jdbc:mysql://localhost:3306/student";
    static String username = "root";
    static String password = "Aksh@115";

    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
