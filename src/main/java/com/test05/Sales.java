package com.test05;

public class Sales {

  String name;
  int number;
  String department;
  int salary;

  Sales() {
  }

  Sales(String name, int number, String department, int salary) {
    this.name = name;
    this.number = number;
    this.department = department;
    this.salary = salary;
  }

  double tax() {
    double tax = salary * 0.13;
    return salary - tax;
  }

  void incentive(int pay) {
    salary += pay * 1.20;
  }


}
