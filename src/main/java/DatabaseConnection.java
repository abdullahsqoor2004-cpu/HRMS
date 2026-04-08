import java.sql.*;

public class DatabaseConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr"
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}