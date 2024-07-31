package lion;

class Static {
  public int a = 20;
  static int b = 0;
}

public class Exam29 {
  public static void main(String[] args) {

    int a;
    a = 10;
    Static.b = a;

    Static st = new Static();

    System.out.println(Static.b++); // 예상 출력 : 10 // 정답: 10
    System.out.println(st.b); // 예상 출력 : 11 // 정답: 11
    System.out.println(a); // 예상 출력 : 10 // 정답: 10
    System.out.println(st.a); // 예상 출력 : 20; // 정답: 20
  }
}
