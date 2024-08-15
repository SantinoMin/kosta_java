import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

  public static void main(String[] args) throws Exception {

//    문제
//    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

    // 1) 첫번째 줄에는 N개의 숫자의 개수인 N이 있음 -> 읽기만 하고 넘어가기
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();

    // 2) 두번째 줄에 입력되는 전체 정수값들을 나눠야 되는데 -> 어떻게 나눌지?
    // br.readLine()의 값들을 ""공백없이 저장하는 리스트를 만들어서, 거기다가 하나씩 넣어보자
    ArrayList<Integer> arr = new ArrayList<>();
    String[] numbers = br.readLine().split(""); // 한 줄에 입력된 값들을 공백이 없는 ""로 나누고, 값 저장하기

    // for문으로 numbers[n]번까지 저장하기.
    for (int i = 0; i < numbers.length; i++) {
      arr.add(numbers[i]);
    }
    System.out.println("arr = " + arr.toString());

    // 3) 나눈 값들을 각각 더해야 함
//    arr[0] + arr[1] + arr[2]...arr[n];
    //for문 안에서 값들을 저장하는 방향으로 진행



    for (int i = 0; i < N.length(); i++) {
      String sum = "";
      sum = sum + arr.get(i);
      System.out.println(sum);
    }



  }

}