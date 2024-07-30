//package lion;
//
//class Person  {
//  private String name;
//
//  public Person(String val) {
//    name = val;
//  }
//
//  public static String get() {
//    return name;
//  }
//
//  public void print() {
//    System.out.println(name);
//  }
//}
//
//public class Main {
//  public static void main(String[] args) {
//    Person obj = new Person("Kim");
//    obj.print();
//  }
//}
//
//// 문제 : 에러 발생 위치 찾기
//// name이 private이라서 get()메서드에서 사용 불가한듯?
//// Person클래스 내부에 있더라도, 생성자로만 사용 가능하고, 다른 메서드에서는 사용 불가한 거 맞는지?
