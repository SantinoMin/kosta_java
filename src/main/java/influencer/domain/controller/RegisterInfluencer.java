//package influencer.domain.controller;
//
//
//import BankMybatis.domain.dto.Account;
//import BankMybatis.domain.service.AccountService;
//import BankMybatis.domain.service.AccountServiceImpl;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/registerInfluencer")
//public class RegisterInfluencer extends HttpServlet {
//
//  public RegisterInfluencer() {
//    super();
//  }
//
//  @Override
//  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//      throws ServletException, IOException {
//    super.doGet(req, resp);
//  }
//
//
//  @Override
//  protected void doPost(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//    //1. 요청으로부터 데이터 가져오기
//    request.setCharacterEncoding("UTF-8");
//
//    String introLine = request.getParameter("introLine");
//
//    String youtubeName = request.getParameter("youtubeName");
//    int youtubeFollower = Integer.parseInt(request.getParameter("youtubeFollower"));
//    String youtubeUrl = request.getParameter("youtubeUrl");
//
//    String instagramName = request.getParameter("instagramName");
//    int instagramFollower = Integer.parseInt(request.getParameter("instagramFollower"));
//    String instagramUrl = request.getParameter("instagramUrl");
//
//    String blogName = request.getParameter("youtubeName");
//    int youtubeFollower = Integer.parseInt(request.getParameter("youtubeFollower"));
//    String youtubeUrl = request.getParameter("youtubeUrl");
//
//    Integer balance  = Integer.parseInt(request.getParameter("balance"));
//    String type = request.getParameter("type");
//    String grade = request.getParameter("grade");
//    Account acc = new Account(id,name,balance,type,grade);
//    ///////////////////////////
//
//    try {
//      //2. 데이터 처리하기 : Model
//      AccountService service = new AccountServiceImpl();
//      Account macc = service.makeAccount(acc);
//      ////////////////////////
//
//      //3. 처리한 데이터 View 지정하여 넘겨주기
//      request.setAttribute("acc", macc);
//      request.getRequestDispatcher("accountinfo.jsp").forward(request, response);
//      ////////////////////////
//    } catch(Exception e) {
//      e.printStackTrace();
//      request.setAttribute("err", e.getMessage());
//      request.getRequestDispatcher("err.jsp").forward(request, response);
//    }
//  }
//  }
//}
