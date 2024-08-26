package Cookies.domain.controller;

import BankMybatis.domain.service.MemberService;
import BankMybatis.domain.service.MemberServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {

  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Login() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    String cookie = request.getHeader("Cookie");
    String autoLogin = null;
    String id = null;
    String password = null;
    if (cookie != null) {
      Cookie[] cookies = request.getCookies();
      for (Cookie c : cookies) {
        if (c.getName().equals("autoLogin")) {
          autoLogin = c.getValue();
        }
        if(c.getName().equals("id")) {
          id = c.getValue();
        }
        if(c.getName().equals("password")) {
          password = c.getValue();
        }
      }
    }
    if(autoLogin != null){
      request.setAttribute("autoLogin", autoLogin);
      request.setAttribute("id", id);
      request.setAttribute("password", password);

    }
    request.getRequestDispatcher("login.jsp").forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    String autoLogin = request.getParameter("autoLogin");

    try {
      MemberService service = new MemberServiceImpl();
      service.login(id, password);
      request.getSession().setAttribute("memberId", id);
      if (autoLogin != null) {
        Cookie cookieId = new Cookie("id", id);
        cookieId.setMaxAge(60 * 60 * 24); // 쿠키의 유효기간 설정 // 1일 동안 유효
        response.addCookie(cookieId);
        Cookie cookiePassword = new Cookie("password", password);
        cookieId.setMaxAge(60 * 60 * 24); // ?
        response.addCookie(cookiePassword);
        Cookie cookieAutoLogin = new Cookie("autoLogin", autoLogin);
        cookieId.setMaxAge(60 * 60 * 24); // ?
        response.addCookie(cookieAutoLogin);
      } else { // 이미 쿠기가 있으면 삭제 작업
        Cookie cookieId = new Cookie("id", id);
        cookieId.setMaxAge(60 * 60 * 24);
        response.addCookie(cookieId);
        Cookie cookiePassword = new Cookie("password", password);
        cookieId.setMaxAge(60 * 60 * 24);
        response.addCookie(cookiePassword);
        Cookie cookieAutoLogin = new Cookie("autoLogin", autoLogin);
        cookieId.setMaxAge(60 * 60 * 24);
        response.addCookie(cookieAutoLogin);

      }

      request.getRequestDispatcher("makeaccount.jsp").forward(request, response);
    } catch (Exception e) {
      e.printStackTrace();
      request.setAttribute("err", e.getMessage());
      request.getRequestDispatcher("err.jsp").forward(request, response);
    }
  }

}
