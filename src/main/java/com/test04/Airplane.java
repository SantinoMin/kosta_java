package com.test04;

public class Airplane extends Plane{

  Airplane() {
  }

  Airplane(String planeName, int fuelSize) {
//    this.planeName = planeName;
//    this.fuelSize = fuelSize;
    super(planeName,fuelSize);
  }

  @Override
  void flight(int distance) {

//    fuelSize -= distance * 3;
    super.setFuelSize(distance * (-3));
  }

//  @Override
//  public void setFuelSize(int fuelSize) {
//    super.setFuelSize(fuelSize);
//  }

}
