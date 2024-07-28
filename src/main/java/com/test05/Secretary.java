package com.test05;

public class Secretary extends Employee{

//  String name;
//  int number;
  String department;
  int salary;


//  Employee emp = new Employee("홍길동",1, Secretary ,800);

//  Secretary sec = new Secretary();

  Secretary() {
  }

  public Secretary(String name, int number, String department, int salary) {
    super(name,number,department,salary);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  double tax(){
    double tax = salary * 0.1;
    return salary - tax;
  }

  void incentive(int pay){
    salary += pay * (1.8);
  }
}
