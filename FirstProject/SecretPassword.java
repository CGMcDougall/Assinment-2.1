import java.util.Scanner;
public class SecretPassword
{
    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Password?");
        String Password = "h";
        String A = "NA";
        System.out.println("");
        int i = 0;
while(i < 1){A = Sc.nextLine();
i++;
}
    
        if (A.equals(Password)){
            System.out.println("You know your stuff");
        }
        else{
          System.out.println("You will NEVER GET ME LUCKY CHARMS!"); 
          i = 0;
        }
    } 
}
