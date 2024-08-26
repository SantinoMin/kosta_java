//package BoardMybatis.domain.controller;
//
//import BankMybatis.domain.dto.Member;
//import BankMybatis.domain.service.MemberService;
//import BankMybatis.domain.service.MemberServiceImpl;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class Join
// */
//@WebServlet("/join")
//public class BoardJoin extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public BoardJoin() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("join.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		Member member = new Member();
//		member.setId(request.getParameter("id"));
//		member.setName(request.getParameter("name"));
//		member.setPassword(request.getParameter("password"));
//		member.setEmail(request.getParameter("email"));
//		member.setAddress(request.getParameter("address"));
//
//		try {
//			MemberService service = new MemberServiceImpl();
//			service.join(member);
//			response.sendRedirect("login");
//		} catch(Exception e) {
//			e.printStackTrace();
//			request.setAttribute("err", e.getMessage());
//			request.getRequestDispatcher("err.jsp").forward(request, response);
//		}
//	}
//}
