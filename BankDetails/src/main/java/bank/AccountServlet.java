package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateAccountServlet")
public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String accountNumber = request.getParameter("accountNumber");
        String balanceStr = request.getParameter("balance");
        
        // Validate inputs
        if (userId == null || userId.isEmpty() ||
            password == null || password.isEmpty() ||
            accountNumber == null || accountNumber.isEmpty() ||
            balanceStr == null || balanceStr.isEmpty()) {
            response.sendRedirect("UserError.jsp"); // Invalid input, redirect to error page
            return;
        }
        
        double balance;
        try {
            balance = Double.parseDouble(balanceStr);
        } catch (NumberFormatException e) {
            response.sendRedirect("UserError.jsp"); // Invalid balance format, redirect to error page
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Aamir@489");
            System.out.println("connection established...");

            String sql = "INSERT INTO accounts (user_id, password, account_number, balance) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, userId);
            statement.setString(2, password);
            statement.setString(3, accountNumber);
            statement.setDouble(4, balance);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("UserSuccess.jsp");
            } else {
                response.sendRedirect("UserError.jsp");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("UserError.jsp");
        }
    }
}
