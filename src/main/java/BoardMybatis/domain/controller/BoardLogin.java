package BoardMybatis.domain.controller;

import BankMybatis.domain.service.MemberService;
import BankMybatis.domain.service.MemberServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/boardLogin")
public class BoardLogin extends HttpServlet {
private static final long serialVersionUID = 1L;

  public BoardLogin() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("boardLogin.jsp").forward(req, resp);

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("utf-8");
    String id = req.getParameter("id");
    String password = req.getParameter("password");

    try {
      MemberService service = new MemberServiceImpl();
      service.login(id, password);
      req.getSession().setAttribute("memberId", id);
      req.getRequestDispatcher("makeaccount.jsp").forward(req, resp);
    } catch(Exception e) {
      e.printStackTrace();
      req.setAttribute("err", e.getMessage());
      req.getRequestDispatcher("err.jsp").forward(req, resp);
    }
  }
}
