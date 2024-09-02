//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class Main {
//
//  public static void main(String[] args) throws Exception {
//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    ArrayList<Integer> arr = new ArrayList<>();
//
//    for(int i = 0; i < 9; i++){
//      arr.add(Integer.parseInt(br.readLine()));
//    }
//    System.out.println(arr);
//    //배열에 맞게 들어감
//
//    //ArrayList에서 1) 최대값
//    Optional<Integer> max = arr.stream().max(Integer::compareTo);
//    max.ifPresent(System.out::println);
//
//    // 2) 해당 값의 위치 찾기
//    max.ifPresent(maxValue -> {
//          int index = arr.indexOf(maxValue);
//          System.out.println(index+1);
//        }
//        );
//
//
//
//
//  }
//}
//
