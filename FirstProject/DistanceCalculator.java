
import java.util.Scanner;
public class DistanceCalculator
{
  public static void main (String[] args) {
         Scanner Sc = new Scanner(System.in); 
             System.out.println("Welcome to Distance Calculator");
             System.out.println("----------------------------");
             System.out.println("");
              System.out.println("Input X, then Y cordinate of Point 1");
             int x1 = Sc.nextInt();
                 int y1 = Sc.nextInt();
              System.out.println("Input X, then Y cordinate of Point 2");
              int x2 = Sc.nextInt();
              int y2 = Sc.nextInt();
              System.out.println("");
                  
          Double Distance = Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2) );
          
           System.out.println("The Distance is "+ Distance);
          
        }
}
