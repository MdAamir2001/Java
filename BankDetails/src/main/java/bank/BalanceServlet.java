package bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userId = (String) session.getAttribute("userId");

        BankDao bankDao = new BankDao();
        double balance = 0;
		balance = bankDao.getBalance(userId);

        request.setAttribute("balance", balance);
        request.getRequestDispatcher("Balance.jsp").forward(request, response);
    }
}
