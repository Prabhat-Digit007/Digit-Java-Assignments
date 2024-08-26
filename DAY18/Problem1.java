import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Problem1 {
    private static final String URL="jdbc:postgresql://localhost:5432/test_db";
    private static final String USER="postgres";
    private static final String PASSWORD ="root";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)) {
            System.out.println("Connection established successfully :) ----");
        } catch (SQLException e) {
            System.out.println("Connection Failed. Try again :(");
        }
    }
}
