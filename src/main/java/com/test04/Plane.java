package com.test04;

public abstract class Plane {

  String planeName;
  int fuelSize;


  public static void line(){
    System.out.println("Plane Fuelsize");
    System.out.println("---------------");

  }

  Plane() {

  }

  Plane(String planeName, int fuelSize) {
    this.planeName = planeName;
    this.fuelSize = fuelSize;
  }

  void refule(int fuel) {  // 주유
    this.fuelSize += fuel;
  }


  //!!추상메소드로서 하위클래스에서 반드시 구현
  //해당 메서드가 해당 추상메서드인지 어떻게 알 수 있지?
  abstract void flight(int distance);  // 운항

  @Override
  public String toString(){
    return String.format("%s, %d", this.planeName, this.fuelSize);
  }

  public void getPlaneName(String planeName) {
    this.planeName = planeName;
  }

  public void setPlaneName(String planeName) {
    this.planeName = planeName;
  }

  public void getFuelSize(int fuelSize) {
    this.fuelSize = fuelSize;
  }

  public void setFuelSize(int fuelSize) {
    this.fuelSize += fuelSize;
  }
}
