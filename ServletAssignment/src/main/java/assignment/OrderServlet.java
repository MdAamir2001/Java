package assignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get order details and customer details from request parameters
        String productName = request.getParameter("product");
        String customerName = request.getParameter("customerName");
        String customerAddress = request.getParameter("customerAddress");

        // Perform order processing logic (e.g., save to database)

        // Display order success message
        response.getWriter().println("Order placed successfully!");

        // Redirect back to home page
        response.setHeader("Refresh", "3; URL=index.html");
    }
}
