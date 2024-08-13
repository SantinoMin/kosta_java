import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

  public static void main(String[] args) throws Exception {

//    문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;

    while( (str=br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(str);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      System.out.println(a+b);
    }
    br.close();
  }
};


//    String input = sc.nextLine();
//    String[] arr = input.split(" ");
//    String sum = arr[0] + arr[1];
//
//    for(int i = 0; i < 5; i++){
//      System.out.println(a+b);
//      sc.nextLine();

