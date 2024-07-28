package Exam0726;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest1 {

  public static void main(String[] args) {

    FileReader fr = null;
    BufferedReader br = null;
    FileWriter fw = null;
    BufferedWriter bw = null;

    try {
      fr = new FileReader("news.txt");
      br = new BufferedReader(fr);
      fw = new FileWriter("cpy.txt");
      bw = new BufferedWriter(fw);
      String line = null;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (bw != null) {
          bw.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
