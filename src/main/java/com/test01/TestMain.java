package com.test01;

public class TestMain {

  public static void main(String[] args) {

    int[][] array = {{12, 42, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65},
        {45, 26, 72, 23, 34}};

    //합계와 평균 구하기 (둘 다 double타입)
    //1.전체 배열의 길이
    //2.각 배열 내부의 길이
    //3.각 배열 내부의 길이들의 합
    double sum = 0;
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
        count++;
      }
    }
    double average = sum / count;

    System.out.println(sum);
    System.out.println(average);
  }
}

