import java.sql.*;

public class Problem4 {
    private static final String URL = "jdbc:postgresql://localhost:5432/bank_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            double transferAmount = 1000;
            int accountId = 3;
            int receiverAccountId = 2;

            withdraw(accountId, transferAmount, connection);
            deposit(receiverAccountId, transferAmount, connection);
            connection.commit();


        } catch (SQLException e) {
            try {
                connection.close();

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(e.getMessage());
        }
    }

    private static void deposit(int receiverAccountId, double transferAmount, Connection connection) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("update accounts set balance = balance + ?  where account_id = ?");
        preparedStatement.setDouble(1, (transferAmount));
        preparedStatement.setInt(2, receiverAccountId);
        int rowaffected = preparedStatement.executeUpdate();
        if (rowaffected > 0) {
            System.out.println(transferAmount + " successfully received");
        }
    }

    private static void withdraw(int accountId, double transferAmount, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update accounts set balance = balance - ? where account_id = ?");
        preparedStatement.setDouble(1, transferAmount);
        preparedStatement.setInt(2, accountId);
        int rowAffected = preparedStatement.executeUpdate();

        if (rowAffected > 0) {
            System.out.println(transferAmount + " amount transferred successfully :) ");

        } else {
            System.out.println("Transaction failed");
            connection.rollback();
            throw new SQLException("Transaction failed due to some inconvenience");
        }
    }
}


