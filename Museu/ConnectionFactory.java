package Museu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.RuntimeException;

public class ConnectionFactory {

    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/BD2", "root", "12345678");

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
