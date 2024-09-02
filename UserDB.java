//# DB 처리과정

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. db 연결 : connection 2. sql문 실행을 위해 statement 얻기 : statement, preparedStatement, :
 * conn.createStatement() 3. sql 문 문자열로 작성 4. 쿼리문 실행 : executeUpdate
 */

public class UserDB {

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      Class.forName("org.mariadb.jdbc.Driver");
      DriverManager.getConnection("jdbc:mariadb://localhost:3309/test", "root", "7564");
      stmt = conn.createStatement();
      String sql = "insert into user (id,name) values ('song', '송길동')";
      int cnt = stmt.executeUpdate(sql);
      System.out.println(cnt + "개 데이터 삽입 성공");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}



