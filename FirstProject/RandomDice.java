
import java.util.Scanner;


public class RandomDice
{
  
     public static void main (String[] args) {
 
         Scanner Sc = new Scanner(System.in); 
     System.out.println("Welcome to ranadom dice");
     System.out.println("------------------------");
     System.out.println("");
    // System.out.println("Enter the amount of dice you want"); 
     int i = 0;
   
     while(i < 10){
         i++;
         double A = ((Math.random()) * 6) + 1;
         int Value = (int)A;
         System.out.println("Dice "+i+" is " + Value);
         
        }
 
   
}
}
