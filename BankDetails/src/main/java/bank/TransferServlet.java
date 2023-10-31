package bank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destinationAccount = request.getParameter("destinationAccount");
        String amountStr = request.getParameter("amount");
        double amount = Double.parseDouble(amountStr);

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        BankDao bankDao = new BankDao();
        boolean transferSuccessful = bankDao.transfer(userId, destinationAccount, amount);

        if (transferSuccessful) {
            response.sendRedirect("TransferSuccess.jsp");
        } 
//        else {
//            response.sendRedirect("TransferError.jsp");
//        }
    }
}
