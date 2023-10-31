package bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Aamir@489");

            String sql = "SELECT * FROM accounts WHERE user_id = ? AND password = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, userId);
            statement.setString(2, password);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String fetchedUserId = resultSet.getString("user_id");
                String fetchedPassword = resultSet.getString("password");

                request.setAttribute("fetchedUserId", fetchedUserId);
                request.setAttribute("fetchedPassword", fetchedPassword);

                request.getRequestDispatcher("Welcome.jsp").forward(request, response);
            } 
//            else {
//                response.sendRedirect("UserError.jsp");
//            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
//            response.sendRedirect("UserError.jsp");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
