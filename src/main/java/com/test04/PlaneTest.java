package com.test04;

public class PlaneTest  {

  public static void main(String[] args) {


    Plane.line();
    Airplane ap = new Airplane("L777", 1000);
    System.out.println(ap.toString());

    Cargoplane cp = new Cargoplane("C50",1000);
    System.out.println(cp.toString());

    Plane.line();
    ap.flight(100);
    cp.flight(100);
    System.out.println(ap.toString());
    System.out.println(cp.toString());

    Plane.line();
    ap.refule(200);
    cp.refule(200);
    System.out.println(ap.toString());
    System.out.println(cp.toString());
  }
}
