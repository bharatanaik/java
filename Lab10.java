
// Aim: Exception handling in java, introduction to throwable class, throw, throws, 
// finally. 
// Program 10: Write a Java program to read two integers a and b. Compute a/b and 
// print, when b is not zero. Raise an exception when b is equal to zero.
import java.util.*;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the Two Interger Values\nA :");
        a = scan.nextInt();
        System.out.print("B :");
        b = scan.nextInt();
        scan.close();
        try {
            if (b == 0)
                throw new ArithmeticException("Divide By Zero");
            c = a / b;
            System.out.println("\nThe Value of " + a + " / " + b + " is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Enter a non zero number for B!!!");
        }
    }
}