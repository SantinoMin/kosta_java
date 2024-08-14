import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

//    문제
//    N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//    출력
//    첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

    // 1) 첫째 줄에 정수의 개수 N개가 있으니, 배열에 값을 넣을 때 N번 전까지 넣으면 될듯
    // 2) 두번째 줄에 값들이 공백을 가지고 있으니, 공백을 기준으로 값들을 배열에 넣어보기
    // 3) 배열안에서 순서는 중요하지 않으니 hashset사용하면 될 거 같고,
    // 4) 배열 내부에서 값들을 비교해서, 최소값과 최대값 구하기

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= 1 && n <= 1000000){
      sc.nextLine();
    }

    ArrayList<Integer> list = new ArrayList<>();
    String[] input = sc.nextLine().split(" ");

    for(int i = 0; i < input.length; i++){
    list.add(Integer.parseInt(input[i]));

  }
    Collections.sort(list);
    System.out.println(list.get(0) + " " + list.get(list.size() - 1));
  }
}