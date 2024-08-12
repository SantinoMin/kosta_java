import java.util.ArrayList;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

//    문제 10950번
//    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

//    입력
//    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < N; i++) {

      String input = sc.nextLine();
      String[] numbers = input.split(" ");

      int a = Integer.parseInt(numbers[0]);
      int b = Integer.parseInt(numbers[1]);

      System.out.println(a + b);
    }
    sc.close();
  }
};
