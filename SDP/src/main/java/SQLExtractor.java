import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class SQLExtractor {
    public void start() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName).newInstance();
        String server = "localhost";
        String database = "";
        String url = "jdbc:mysql://" + server + "w/" + database;

        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, username, password);

    }
}
