import java.util.Scanner;

public class MyTriangle {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides of a triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    
    if (isValid(side1, side2, side3) == false)
      System.out.println("The input is invalid.");
    else
      System.out.println("The area is " + area(side1, side2, side3));
  }   // main
  
  /* Return true if the sum of any two sides is
   greater than the third side. */
  public static boolean isValid(double side1, double side2, double side3){
    if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2)
      return true;
    else
      return false;
  } // isValid
  
  /** Return the area of the triangle. */
  public static double area(double side1, double side2, double side3){
    double s = (side1+side2+side3)/2;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  } // area
} // MyTriangle class
