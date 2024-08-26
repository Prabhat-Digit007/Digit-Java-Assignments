import java.sql.*;

public class Problem2 {
    private static final String URL = "jdbc:postgresql://localhost:5432/company_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connection established successfully :) ----");
            try (Statement statement = connection.createStatement()) {
                String sql = "Select * from employees";
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    while (resultSet.next()) {
                        for (int i = 1; i <= columnCount; ++i) {
                            System.out.println(resultSet.getMetaData().getColumnName(i) + " -> " + resultSet.getString(i));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed. Try again :(");
        }
    }
}
