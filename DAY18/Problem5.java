import java.sql.*;

public class Problem5 {
    private static final String URL = "jdbc:postgresql://localhost:5432/school_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connection established successfully :) ----");
            String sql = "Select * from students";
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    print(resultSet);
                }
            }
            sql = "update students set grade = 12 where student_id =2;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                int rowAffected = statement.executeUpdate();
                if (rowAffected > 0) {
                    System.out.println("Data inserted successfully");
                }
                else{
                    System.out.println("Insertion failed");
                    return;
                }
                try (ResultSet resultSet = statement.executeQuery()) {
                    print(resultSet);
                }
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed. Try again :(");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void print(ResultSet resultSet) throws SQLException {
        int columnCount = resultSet.getMetaData().getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; ++i) {
                System.out.println(resultSet.getMetaData().getColumnName(i) + " -> " + resultSet.getString(i));
            }
        }
    }
}
