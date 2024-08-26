package BankMybatis.domain.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

import BankMybatis.domain.service.AccountService;
import BankMybatis.domain.service.AccountServiceImpl;


/**
 * Servlet implementation class AccDoubleId
 */
@WebServlet("/accDoubleId")
public class AccDoubleId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccDoubleId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		try {
			AccountService service = new AccountServiceImpl();
			boolean accDoubleId = service.checkAccDoubleId(id);
			response.getWriter().write(String.valueOf(accDoubleId));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
