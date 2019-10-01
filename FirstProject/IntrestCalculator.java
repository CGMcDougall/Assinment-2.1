import java.util.Scanner;
public class IntrestCalculator
{
  public static void main (String[] args) {
         Scanner Sc = new Scanner(System.in); 
         System.out.println("Welcome to Intrest Calculator");
         System.out.println("-----------------------------");
         System.out.println("");
          System.out.println("Input Initial Amount");
          Double P = Sc.nextDouble();
          System.out.println("Input itrest rate");
          Double R = Sc.nextDouble();
          System.out.println("Amount that It compounds Annualy");
          Double N = Sc.nextDouble();
          System.out.println("Input the amount of years");
          Double T = Sc.nextDouble();
          System.out.println("");
          Double A = P*(Math.pow(1 + (R/N),(N*T)));
          System.out.println("Amount with intrest is "+ A);
          
       
       
         
     
    }
}
