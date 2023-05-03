import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int i, fact = 1;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number ");
        n = s.nextInt();
        for(i = 1;i <= n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial Of Number IS : "  +fact);
    }
}
