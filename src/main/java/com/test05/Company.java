package com.test05;

import java.util.HashMap;

public class Company {

  public static void main(String[] args) {

    HashMap<Integer, Employee> map = new HashMap<>();

    Secretary secretary = new Secretary("홍길동",1, "Secretary" ,800);
//    secretary.setName(secretary.getName());
//    secretary.setNumber(secretary.getNumber());
//    secretary.setDepartment(secretary.getDepartment());
//    secretary.setSalary(secretary.getSalary());


    map.put(1, new Employee());
    System.out.println(secretary);

  }
}

// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
//--> 객체 생성 하는 과정에서, abstract 사용법은?

// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
//-->

// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
//-->

// 모든 객체의 인센티브 100씩 지급한다.
//-->

// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
//--> ㅇ