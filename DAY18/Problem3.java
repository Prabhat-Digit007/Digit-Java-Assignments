import java.sql.*;

public class Problem3 {
    private static final String URL = "jdbc:postgresql://localhost:5432/inventory_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connection established successfully :) ----");
                String sql = "Insert into(product_id,name,price,quantity) products values(?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1,10);
                statement.setString(2,"Rohan");
                statement.setInt(3,230000);
                statement.setInt(4,3);

                int rowAffected = statement.executeUpdate();
                System.out.println("Data inserted successfully");
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed. Try again :(");
        }
    }
}
