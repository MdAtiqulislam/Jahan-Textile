package jahantextail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnect {

    public static Connection connection = null;

    public static Connection dbconnect() {
       try {
            /*Class.forName("org.sqlite.JDBC");
             Connection d_connection = DriverManager.
                     getConnection("jdbc:sqlite:jahan.db");
            System.out.println("Connection Successful.");
            return d_connection;*/
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jahan?useSSL=false", "root", "");
            System.out.println("Connection Successful.");

            return connection;
            
        }/* catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
             return null;
        }*/catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

}
