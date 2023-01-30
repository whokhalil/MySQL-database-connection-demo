package Client.demo;

import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCP {
    static Connection con;
    public static Connection create() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "1203";
            String url = "jdbc:mysql://localhost:3306/learn";
            con = DriverManager.getConnection(url,user,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

