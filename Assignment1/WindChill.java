package Assignment1;

/**
 * WindChill
 */
import java.lang.Math;
import java.util.Scanner;
public class WindChill {
 public static double fahrenheitTemp;
 public static double windSpeed;
 public static double windChill;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Wind Chill Calculator");
    System.out.println("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
    fahrenheitTemp = sc.nextDouble();
    System.out.println("Enter the wind speed (must be >= 5 and <= 60): ");
    windSpeed = sc.nextDouble();
    windChill = 35.74 + (0.6215*fahrenheitTemp) - (35.75*Math.pow(windSpeed,0.16)) + (0.4275*fahrenheitTemp*Math.pow(windSpeed,0.16));
    System.out.println("Wind chill temperature: " + windChill + " degrees Fahrenheit");
    System.out.println("Programmer: Abdul Akibu");
    sc.close();
  }
}