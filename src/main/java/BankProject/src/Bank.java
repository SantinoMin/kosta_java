package BankProject.src;

import BankProject.src.acc.Account;
import BankProject.src.acc.SpecialAccount;
import BankProject.src.exc.BankErr;
import BankProject.src.exc.BankException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Bank {

  Scanner sc = new Scanner(System.in);
  Map<String, Account> accs = new HashMap<>();

  int selectMenu() throws BankException {
    System.out.println("[코스타 은행]");
    System.out.println("0. 종료");
    System.out.println("1. 계좌개설");
    System.out.println("2. 입금");
    System.out.println("3. 출금");
    System.out.println("4. 계좌조회");
    System.out.println("5. 전체계좌조회");
    System.out.print(">>");
    int sel = Integer.parseInt(sc.nextLine());
    if (sel < 0 || sel > 5) {
      throw new BankException("메뉴오류", BankErr.BANKMENU);
    }
    return sel;
  }

  void selMakeAccount() throws BankException {
    System.out.println("[계좌개설]");
    System.out.println("1.일반계좌개설");
    System.out.println("2.특수계좌개설");
    System.out.print(">>");
    int sel = Integer.parseInt(sc.nextLine());
    switch (sel) {
      case 1:
        makeAccount();
        break;
      case 2:
        makeSpecialAccount();
        break;
      default:
        throw new BankException("메뉴오류", BankErr.MAKEACCMENU);
    }
  }

  void makeAccount() throws BankException {
    System.out.println("[일반계좌개설]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();

    if (accs.containsKey(num)) {
      throw new BankException("계좌오류", BankErr.EXEACCID);
    }

    System.out.print("이름:");
    String name = sc.nextLine();
    System.out.print("입금액:");
    int money = Integer.parseInt(sc.nextLine());

    accs.put(num, new Account(num, name, money));
  }

  void makeSpecialAccount() throws BankException {
    System.out.println("[특수계좌개설]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();

    if (accs.containsKey(num)) {
      throw new BankException("계좌오류", BankErr.EXEACCID);
    }

    System.out.print("이름:");
    String name = sc.nextLine();
    System.out.print("입금액:");
    int money = Integer.parseInt(sc.nextLine());
    System.out.print("등급(VIP-V,Gold-G,Silever-S,Normal-N):");
    String grade = sc.nextLine();
    accs.put(num, new SpecialAccount(num, name, money, grade));
  }

  void deposit() throws BankException {
    System.out.println("[입력]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();
    System.out.print("입금액:");
    int money = Integer.parseInt(sc.nextLine());
    if (!accs.containsKey(num)) {
      throw new BankException("계좌오류", BankErr.NOTACCID);
    }
    accs.get(num).deposit(money);
  }

  void withdraw() throws BankException {
    System.out.println("[출금]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();
    System.out.print("출금액:");
    int money = Integer.parseInt(sc.nextLine());
    if (!accs.containsKey(num)) {
      throw new BankException("계좌오류", BankErr.NOTACCID);
    }
    accs.get(num).withdraw(money);
  }

  void accountInfo() throws BankException {
    System.out.println("[계좌조회]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();
    if (!accs.containsKey(num)) {
      throw new BankException("계좌오류", BankErr.NOTACCID);
    }
    System.out.println(accs.get(num));
  }

  void allAccountInfo() {
    System.out.println("[전체계좌조회]");
//		Iterator<Account> it = accs.values().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
    for (Account acc : accs.values()) {
      System.out.println(acc);
    }
  }

  public void saveAccsBin() {
    FileOutputStream fos = null;
    DataOutputStream dos = null;
    try {
      fos = new FileOutputStream("accs.bin");
      dos = new DataOutputStream(fos);

      dos.writeInt(accs.size());  //계좌 갯수
      for (Account acc : accs.values()) {  //계좌구분 :특수계좌-S, 일발계좌-N
        if (acc instanceof SpecialAccount) {
          dos.writeChar('S');
          dos.writeUTF(((SpecialAccount) acc).getGrade()); //등급
        } else {
          dos.writeChar('N');
        }
        dos.writeUTF(acc.getNum());  //계좌번호
        dos.writeUTF(acc.getName()); //이름
        dos.writeInt(acc.getBalance()); //잔액
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (dos != null) {
          dos.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void loadAccsBin() {
    FileInputStream fis = null;
    DataInputStream dis = null;
    try {
      fis = new FileInputStream("accs.bin");
      dis = new DataInputStream(fis);
      int cnt = dis.readInt();

      char sect;
      String num = "";
      String grade = "";
      String name = "";
      int balance = 0;

      for (int i = 0; i < cnt; i++) {
        sect = dis.readChar();  //계좌구분:S,N
        if (sect == 'S') {
          grade = dis.readUTF(); //등급
        }
        num = dis.readUTF(); //계좌번호
        name = dis.readUTF(); //이름
        balance = dis.readInt();

        if (sect == 'S') {
          accs.put(num, new SpecialAccount(num, name, balance, grade));
        } else {
          accs.put(num, new Account(num, name, balance));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (dis != null) {
          dis.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void saveAccsTxt() {
    FileWriter fw = null;
    BufferedWriter bw = null;

    //try-catch 항상 있어야 함

    try {
      fw = new FileWriter("accs.txt");
      bw = new BufferedWriter(fw);

      String accStr = "";
      for (Account acc : accs.values()) {
        accStr = acc.getNum();
        accStr += "#" + acc.getName();
        accStr += "#" + acc.getBalance();
        if (acc instanceof SpecialAccount) {
          accStr += "#" + ((SpecialAccount) acc).getGrade();
        }
        bw.write(accStr);
        bw.newLine();
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bw != null) {
          bw.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void loadAccsTxt() {
    FileReader fr = null;
    BufferedReader br = null;

    try {
      String fileName = "accs.txt";
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);

      String accStr = null;
      while((accStr = br.readLine())!=null){
        String[] acc = accStr.split("#");
        String num = acc[0];
        String name = acc[1];
        int balance = Integer.parseInt(acc[2]);
        if(acc.length==4){
          String grade = acc[3];
          accs.put(num, new SpecialAccount(num,name,balance,grade));
        } else {
          accs.put(num, new Account(num,name,balance));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
      }catch (IOException e){
        e.printStackTrace();
      }
    }
  }

//      int data = 0;
//      while ((data = fr.read() != -1)) {
//        System.out.println((char) data);
//      }
//      System.out.println();
//      br.close();




  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.loadAccsBin();
    int sel;

    while (true) {
      try {
        sel = bank.selectMenu();
        if (sel == 0) {
          bank.saveAccsTxt();
          break;
        }

        switch (sel) {
          case 1:
            bank.selMakeAccount();
            break;
          case 2:
            bank.deposit();
            break;
          case 3:
            bank.withdraw();
            break;
          case 4:
            bank.accountInfo();
            break;
          case 5:
            bank.allAccountInfo();
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println("입력형식이 맞지 않습니다.");
      } catch (BankException e) {
        System.out.println(e.toString());
      }
    }
  }
}
/*
 * 1001 홍길동 100000
 * 1002 김길동 200000 VIP
 *
 * 2N1001홍길동100000SVIP1002김길동200000
 * writeInt writeChar writeUTF writeUTF writeInt writeChar writeUTF writeUTF writeInt writeUTF
 *
 * //구분자 정해서, 구간을 나누기(계좌번호, 이름, 잔액)
 * 1001 홍길동 100000
 *
 * 1002 김길동 200000 VIP
 *
 */




