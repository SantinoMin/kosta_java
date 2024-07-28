package com.test04;

public class Cargoplane extends Plane {

  Cargoplane() {
  }

  Cargoplane(String planeName, int fuelSize) {
    this.planeName = planeName;
    this.fuelSize = fuelSize;
  }

  @Override
  void flight(int distance){ // 운항
    fuelSize -= distance * 5;
  }

  @Override
  public void setFuelSize(int fuelSize) {
    super.setFuelSize(fuelSize);
  }

}
