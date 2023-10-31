package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDao {
	public boolean withdraw(String userId, double amount) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE accounts SET balance = balance - ? WHERE user_id = ? AND balance >= ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, amount);
            statement.setString(2, userId);
            statement.setDouble(3, amount); // Ensure minimum balance is maintained

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deposit(String userId, double amount) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE accounts SET balance = balance + ? WHERE user_id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, amount);
            statement.setString(2, userId);

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/bank";
        String jdbcUsername = "root";
        String jdbcPassword = "Aamir@489";

        Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        return connection;

    }


	public boolean transfer(String sourceUserId, String destinationAccount, double amount) {
        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false);

            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE user_id = ?";
            PreparedStatement debitStatement = conn.prepareStatement(debitSql);
            debitStatement.setDouble(1, amount);
            debitStatement.setString(2, sourceUserId);

            int debitRowsUpdated = debitStatement.executeUpdate();

            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
            PreparedStatement creditStatement = conn.prepareStatement(creditSql);
            creditStatement.setDouble(1, amount);
            creditStatement.setString(2, destinationAccount);

            int creditRowsUpdated = creditStatement.executeUpdate();

            if (debitRowsUpdated > 0 && creditRowsUpdated > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

	    public double getBalance(String userId) {
	        try (Connection conn = getConnection()) {
	            String sql = "SELECT balance FROM accounts WHERE user_id = ?";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setString(1, userId);

	            ResultSet resultSet = statement.executeQuery();

	            if (resultSet.next()) {
	                return resultSet.getDouble("balance");
	            } else {
	                return -1; 
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return -1; 
	        }
	    }
	
	public boolean updateBalance(String userId, double amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
