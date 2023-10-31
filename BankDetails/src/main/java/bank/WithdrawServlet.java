package bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount = Double.parseDouble(request.getParameter("amount"));

        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        if (userId != null) {
            BankDao bankDao = new BankDao();
            boolean withdrawalSuccessful = false;

            withdrawalSuccessful = bankDao.withdraw(userId, amount);

            if (withdrawalSuccessful) {
                response.sendRedirect("WithdrawSuccess.jsp");
            } else {
                response.sendRedirect("WithdrawError.jsp");
            }
        } 
//        else {
//            response.sendRedirect("UserLogin.jsp"); // Redirect to login page if userId is null
//        }
    }
}
