package lion;


class Car implements Runnable {

  int a;

  public void run() {
    System.out.println("message");
  }
}

public class Exam22 {


  public class Main {

    public static void main(String[] args) {
      Thread t1 = new Thread(new Car());
      t1.start();
    }
  }
}

// 예상 출력 : 어떻게 구하는지?
// ?? Thread 클래스 역할이 뭐임?