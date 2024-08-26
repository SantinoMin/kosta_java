package BankMybatis.domain.controller;

import BankMybatis.domain.dto.Account;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


import BankMybatis.domain.service.AccountService;
import BankMybatis.domain.service.AccountServiceImpl;


/**
 * Servlet implementation class AllAccountInfo
 */
@WebServlet("/allAccountInfo")
public class AllAccountInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllAccountInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			AccountService service = new AccountServiceImpl();
			List<Account> accs = service.allAccountInfo();
			request.setAttribute("accs", accs);
			request.getRequestDispatcher("allaccountinfo.jsp").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("err", "전체계좌조회 실패");
			request.getRequestDispatcher("err.jsp").forward(request, response);
		}
	}
}
