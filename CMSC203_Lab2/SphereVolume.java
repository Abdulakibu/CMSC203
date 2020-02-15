package CMSC203_Lab2;

import java.util.Scanner;
import java.lang.Math;
public class SphereVolume {
  public static void main(String[] args) {
    // add your declaration and code here
    Scanner sc = new Scanner(System.in);
    double diameter;
    double radius;
    double volume;
    System.out.println("This program will help calulate the volume of a sphere");
    System.out.println("What is the diameter of the sphere?");
    diameter = sc.nextDouble();
    radius = diameter/2;
    volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
    System.out.println("The volume is: " + volume);
    sc.close();
  }
}
