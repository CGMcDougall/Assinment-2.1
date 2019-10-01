import java.util.Scanner;

public class AreaToRadius
{
   public static void main (String[] args) {
      Scanner Sc = new Scanner(System.in);
       System.out.println("Area To Radius Converter");
      System.out.println("-------------------------");
      System.out.println("");
      System.out.print("Enter the circles Area:");
      System.out.println("");
      Double Area = Sc.nextDouble();
      Double Radius = Math.sqrt(Area/Math.PI);
      
      System.out.println("The Radius is "+ Radius);
      
       
       //A = pier2
       
    }
}
