//package Exam0726;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInput;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//class Person implements Serializable {
//
//  int age;
//  String name;
//
//  Person(int age, String name) {
//    this.age = age;
//    this.name = name;
//  }
//
//  @Override
//  public String toString() {
//    return "이름: " + name + ", 나이: " + age;
//  }
//}
//
//public class ObjectStreamTest1 {
//
//  public static void save(List<Person> pers) {
//      FileOutputStream fos = null;
//      ObjectOutputStream oos = null;
//      try {
//        fos = new FileOutputStream("pers.bin");
//        oos = new ObjectOutputStream(fos);
//        oos.writeObject(pers);
//
////        oos.writeInt(pers.size());
////        for(Person p = pers){
////          oos.writeObject(p);
////        }
//      } catch(IOException e){
//        e.printStackTrace();
//      } finally {
//        try {
//          if(oos != null){
//            oos.close();
//          }
//        } catch(IOException e){
//          e.printStackTrace();
//        }
//      }
//  }
//
//  public static List<Person> load() {
////    List<Person> pers = new ArrayList<>();
//    List<Person> pers = null;
//    FileInputStream fis = null;
//    ObjectInputStream ois = null;
//
//    try {
//      fis = new FileInputStream("pers.bin");
//      ois = new ObjectInputStream(fis);
//      pers = (ArrayList<Person>)ois.readObject();
//      int cnt = ois.readInt();
//
////      for(int i = 0; i<cnt; i++){
////        pers.add((Person)ois.readObject());
////      }
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    catch (ClassNotFoundException e){
//      e.printStackTrace();
//    } finally {
//      try {
//        if(ois != null){
//          ois.close();
//        }
//      }catch(IOException e){
//        e.printStackTrace();
//      }
//    }
//    return pers;
//  }
//
//  public static void saveOne(Person p) {
//
//  }
//
//  public static void loadOne(){
//    saveOne(new Person(10,"김적극"));
//
//    Person P = new Person(10, "김적극");
//    FileOutputStream fos = null;
//    ObjectOutputStream oos = null;
//
//    try {
//      fos = new ObjectOutputStream("per.bin");
//      oos = new ObjectOutputStream(fos);
//      oos.writeObject(P);
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      try {
//        if (oos != null) {
//        } oos.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
//  }
//
//  public static void main(String[] args) {
//
////    FileInputStream fis = null;
////    ObjectInputStream ois = null;
////    try {
////      fis = new FileInputStream("per.bin");
////      ois = new ObjectInputStream(fis);
////      Person p = (Person) ois.readObject();
////      System.out.println(p);
////    } catch (IOException e) {
////      e.printStackTrace();
////    } catch (ClassNotFoundException e) {
////      e.printStackTrace();
////    } finally {
////      try {
////        if(ois!=null) ois.close();
////      } catch (IOException e) {
////        e.printStackTrace();
////      }
////    }
////  }
////}
//    List<Person> pers = new ArrayList<>();
//    pers.add(new Person(20, "홍길동"));
//    pers.add(new Person(30, "김길동"));
//    pers.add(new Person(40, "박길동"));
//    pers.add(new Person(50, "송길동"));
//    pers.add(new Person(10, "하길동"));
//
////    save(pers);
//    List<Person> perList = load();
//    System.out.println(perList);
//
//  }};
////    saveOne(new Person(10,"김적극"));
////
//////    Person P = new Person(10, "김적극");
//////    FileOutputStream fos = null;
//////    ObjectOutputStream oos = null;
////
////    try {
////      fos = new ObjectOutputStream("per.bin");
////      oos = new ObjectOutputStream(fos);
////      oos.writeObject(P);
////
////    } catch (IOException e) {
////      e.printStackTrace();
////    } finally {
////      try {
////        if (oos != null) {
////        }
////      } catch (IOException e) {
////        e.printStackTrace();
////      }
////    }
////
////  }
////}
