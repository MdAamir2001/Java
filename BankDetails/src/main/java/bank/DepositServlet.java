package bank;

import java.io.IOException;
import java.sql.SQLException; // Add this import

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amountStr = request.getParameter("amount");
        double amount = Double.parseDouble(amountStr);

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        BankDao bankDao = new BankDao();
        boolean depositSuccessful = false;
        
        depositSuccessful = bankDao.deposit(userId, amount);

        if (depositSuccessful) {
            response.sendRedirect("DepositSuccess.jsp");
        } 
//        else {
//            response.sendRedirect("DepositError.jsp");
//        }
    }
}
