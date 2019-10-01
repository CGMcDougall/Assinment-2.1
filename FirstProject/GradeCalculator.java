import java.util.Scanner;
public class GradeCalculator
{
 public static void main (String[] args) {
 Scanner Sc = new Scanner(System.in);
    System.out.println("Depression Calcu... I MEAN, Grade Calculator");
    System.out.println("--------------------------------------------");
    System.out.println("");
    
    System.out.println("What was it out of?");
    double OUT = Sc.nextDouble();
    System.out.println("What did you get?");
    double IN = Sc.nextDouble();
       
    if(IN > 0 && OUT > 0){
    double Percent = (IN/OUT) * 100;
    System.out.println("You got "+ Percent);
    
    if(Percent >= 86)System.out.println("You got a A!");
    else if(Percent >= 72)System.out.println("You got a B");
    else if (Percent >= 51) System.out.println("You got a BEATING");  
    else System.out.println("You get INSTANT DEATH");
    }
    
    else System.out.println("You have squandered this gift");
    
 
}
}
