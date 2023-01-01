import java.util.Scanner;

public class Lab3b {
    public static void main(String[] args) {
        char op;
        double a, b, res = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a arithmetic expression: ");
        a = input.nextDouble();
        op = input.next().charAt(0);
        b = input.nextDouble();
        
        input.close();

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Zero division error!!");
                    return;
                }
                res = a / b;
                break;
            case '%':
                res = a % b;
                break;

            default:
                System.out.println("Invalid operation!");
                return;
        }
        System.out.println("a " + op + " b = " + res);
    }
}
