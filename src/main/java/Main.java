import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
//    최댓값
//    문제
//    9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//        예를 들어, 서로 다른 9개의 자연수
//
//    3, 29, 38, 12, 57, 74, 40, 85, 61
//
//    이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
//
//    입력
//    첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.



    // 1) 최대값이 얼마인지 2) 해당 값은 몇번째에 있는지

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 입력되는 값들을 List에 넣기 // 아홉번째 줄까지 값이 들어옴
    List<Integer> numbers = new ArrayList<>();

    for(int i = 0; i < 9; i++){
      numbers.add(Integer.parseInt(br.readLine()));
    }
    System.out.println(numbers);

    // 값들 비교해서


  }
}

