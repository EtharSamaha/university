package testdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Imad
 */
public class DBHelper {
// wqdefrgh
    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
            return conn;
        } catch (ClassNotFoundException ex) {
            System.err.println("Class Not Found");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return null;
    }
}
