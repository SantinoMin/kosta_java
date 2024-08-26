package Cookies.domain.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;

@WebServlet("/cookieEx")
public class CookieEx extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

  public CookieEx() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String language = "korea";
    String cookie = req.getHeader("Cookie");
    if(cookie!=null){
      Cookie[] cookies = req.getCookies();
      for(Cookie c : cookies){
        if(c.getName().equals("language")){
            language = c.getValue();
        }
      }
    }
    req.setAttribute("language", language);
    req.getRequestDispatcher("cookieExample.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    String language = req.getParameter("language");
    Cookie cookie = new Cookie("language", language);
    cookie.setMaxAge(60*60*24);
    resp.addCookie(cookie);
    resp.sendRedirect("cookieEx");
  }
}


//CookieEx.java 와 cookieExample.jsp 어떻게 연결?


