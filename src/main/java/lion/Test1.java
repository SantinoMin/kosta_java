package lion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

  public static void main(String[] args) {

    Scanner sr = new Scanner(System.in);
    String str = "hello";

    while (true) {

      try {
        int num = sr.nextInt();
        if (0 <= num && num < str.length()) {
          System.out.println(str.charAt(num));
          break;
        } else {
          System.out.println(num + " " + str.charAt(num));
        }
      } catch (InputMismatchException e) {
        System.out.println(e.getMessage());
        sr.next();
      }
      }
    sr.close();
    }
  };
