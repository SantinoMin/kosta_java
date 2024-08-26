package BankMybatis.domain.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import BankMybatis.domain.service.MemberService;
import BankMybatis.domain.service.MemberServiceImpl;

/**
 * Servlet implementation class MemberDoubleId
 */
@WebServlet("/memberDoubldId")
public class MemberDoubleId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDoubleId() {
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
			MemberService service = new MemberServiceImpl();
			boolean doubldId = service.checkDoubleId(id);
			response.getWriter().write(String.valueOf(doubldId));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
