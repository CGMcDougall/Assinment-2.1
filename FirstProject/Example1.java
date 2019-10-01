import java.util.Scanner;

class Example1 {
public static void main (String[] args) {
 Scanner Sc = new Scanner(System.in);
 
    
    System.out.println("Pythagorean Therem Calculator");
    System.out.println("A:");
    int a = Sc.nextInt();
    System.out.println("B:");
       int b = Sc.nextInt();
 Double c = Math.sqrt(Math.pow(a,2) + b*b);
 
   System.out.println(c);
 
}
     
}
