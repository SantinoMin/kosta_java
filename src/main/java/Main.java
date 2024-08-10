import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    // 우선 모든 값을 배열에 넣어야지 넣은 값중에 가장 짧은걸 찾을 수 있을듯?

    // 입력을 내가 하는게 아니라, 원래 배열에 넣어둬야 되는건가?
    // -> 단어의 개수 N이 주어지기 때문에, N값은 정해져 있는게 아니라, N개의 줄에 단어들이 있는걸 보면, N개의 줄에 있는 값들의 합을
    // N = 단어들 수의 합

    // 값이 어떤식으로 구성되어 있는지부터 생각해보기

    Scanner sc = new Scanner(System.in);

    // 0. 첫 줄에는 배열에 넣은 값들, 배열 - 1개
    // 1. 값들을 배열에 넣고, 그 안에서 비교를 해보기. -- 배열의 0번째 vs 배열의 1번째 비교하는 메서드로.
    // 2. 길이가 짧은 순이 앞으로 오도록
    // 3. 길이가 같다면, 사전 순으로.

    int count = sc.nextInt();
    ArrayList<String> array = new ArrayList<>();
    sc.nextLine();

//    for (int i = 0; i < count - 1; i++) {
//      array.add(sc.nextLine());
//    }
//    array.remove(array.get(0));
//
//    System.out.println(array);

    // array[n]과 array[n+1]을 비교해서, 1) 만약 값이 같다면, n+1번째 값을 삭제.
    // array[n]과 array[n+1]의 문자열 길이를 비교해서 array[n]의 문자열 길이가 짧다면, 그대로 진행
    // but array[n+1]의 문자열 길이가 짧다면, array[n] = array[n+1]로 진행 +

//    for(int i=0; i < array.size(); i++) {
//
//      if (array.size() > 1) {
//          if(array.get(i).length() > array.get(i+1).length()){
//            array.set(i, array.get(i+1));
//          } if(array.get(i) == array.get(i+1)){
//            array.remove(array.get(i+1));
        }

      }

    }
  }
}

