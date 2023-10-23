package pers.chenmo.myapp.Fourthly;

interface A {
  double PI = 3.14;

  double area();

}

interface B {
  void setColor(String c);

}

interface C extends A, B {
  void volume();
}

class Cylinder implements C {
  int radius;
  int height;
  String color;

  public Cylinder(int radius, int height, String color) {
    this.radius = radius;
    this.height = height;
    this.color = color;
  }

  public Cylinder() {

  }

  public double area() {
    return Math.pow((A.PI * this.radius), 2);
  }

  public void setColor(String c) {
    this.color = c;
  }

  public void volume() {

    System.out.println("圆柱体体积为" + (this.area() * this.height) + "立方米");

  }

}

public class Fourthly {
  public static void main(String[] args) {
    Cylinder c = new Cylinder(5, 10, "red");

    c.volume();

  }
}
