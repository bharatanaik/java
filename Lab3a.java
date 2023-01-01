import java.util.Scanner;

public class Lab3a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not: ");
        int n = s.nextInt();
        s.close();
        int m = n/2;
        if (n==0 || n==1) {
            System.out.println(n+" is prime");
            return;
        }
        for (int j = 2; j < m; j++) {
            if (n%j==0) {
                System.out.println(n+" is not a prime");
                return;
            }
        }
        System.out.println(n+" is a prime"); 
    }
}
