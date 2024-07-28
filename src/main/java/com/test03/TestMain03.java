package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

//  주어진 String 데이터를 “,”로 구분하여 5개의 실수 데이터를 추출하고 합과 평균을 구한다. ( StringTokenizer 사용 )
//  단, String 문자열의 모든 실수 데이터를 List에 저장하고 계산한다.

  public static void main(String[] args) {

    String str = "1.22,4.12,5.93,8.71,9.34";
    List<String> list = new ArrayList<>();
    //String Tokenizer 이용 --> List에 저장



    StringTokenizer st = new StringTokenizer(str, ",");

//    System.out.println(st.countTokens());
    while(st.hasMoreTokens()){
      list.add(st.nextToken());
    }
    System.out.println(list);

    double sum = 0.0;
    double average = 0.0;

    for(String value : list){
      sum += Double.parseDouble(value);
    }

    average = Double.parseDouble(String.format("%.4f", sum/list.size()));
    System.out.println(average);
    System.out.println(sum);







    //List에 저장된 데이터의 합과 평균을 구한다.

  }
}
