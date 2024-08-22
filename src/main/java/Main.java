import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws Exception {


    //1.첫째줄에는 단어의 개수 N개가 출력됨
    //2.길이 비교하기 (짧은 것부터, 길이가 같으면 사전 순으로)
    //3.데이터를 ArrayList에 넣어서, 비교를 해야 될 듯?

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    int count = Integer.parseInt(br.readLine());

    ArrayList<String> arr = new ArrayList<>();
    for(int i = 0; i < count; i++) {
      arr.add(br.readLine());
    }


    System.out.println("arr = " + arr);







  }
}

