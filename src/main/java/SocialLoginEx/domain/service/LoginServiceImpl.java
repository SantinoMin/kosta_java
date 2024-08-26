//package SocialLoginEx.domain.service;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.URL;
//import javax.net.ssl.HttpsURLConnection;
//
//public class LoginServiceImpl implements LoginService {
//
//
//  @Override
//  public void kakaoLogin(String code) {
//
//  }
//
//  String getKakaoToken(String code) throws Exception {
//    String tokenUrl = "https://kauth.kakao.com/oauth/token";
//    URL url = new URL(tokenUrl);
//    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
//    conn.setRequestMethod("POST");
//    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
//    conn.setDoOutput(true);
//
//    StringBuilder param = new StringBuilder();
//    param.append("grant_type=authorization_code");
//    param.append("&client_id=");
//    param.append("&redirect_uri=https://localhost:8080/social/kakao");
//    param.append("&code=" + code);
//
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
//    bw.write(param.toString());
//    bw.flush();
//
//    // 응답
//    BufferedReader br = null;
//
//    int resultCode = conn.getResponseCode();
//    if (resultCode >= 200 && resultCode <= 300) {
//      br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//      //정상
//    }
//
//    StringBuilder resBuilder = new StringBuilder();
//    String line;
//
//    while((line=br.readLine())!=null){
//      resBuilder.append(line);
//    }
//
//    System.out.println(resBuilder.toString());
//    br.close();
//    conn.disconnect();
//
//    return null;
//  }
//}
