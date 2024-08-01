package lion;

public class Main28 {

  public static void main(String[] args) {
    int[][] a = new int[3][5];  // 3이랑 5 맞는듯?
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        a[i][j] = j * 3 + (i + 1);
        System.out.print(a[i][j] + "");
      }
      System.out.println();
    }
  }
}
