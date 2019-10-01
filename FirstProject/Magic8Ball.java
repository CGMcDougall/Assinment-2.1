
import java.util.Scanner;
public class Magic8Ball
{
    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome, Mortal, to the GREAT MAGICAL 8 BALL!");
        System.out.println("ASK THY QUESTION!");
        String Fake = Sc.nextLine();

        double A = ((Math.random()) * 9) + 1;
        int Value = (int)A;
        

        if(Value == 1)System.out.println("Thats a No");
        if(Value == 2)System.out.println("Nope");
        if(Value ==3)System.out.println("Maybe");
        if(Value == 4)System.out.println("Yes");
        if(Value == 5)System.out.println("100 percent");
        if(Value == 6)System.out.println("Possibly");
        if(Value == 7)System.out.println("Get out of my Sight");
        if(Value == 8)System.out.println("Sure");
        if(Value == 9)System.out.println("23");

    }
}
