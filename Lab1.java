import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        double a, b, c, d, value1, value2, real, imag;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter coeffecients: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        if(a==0){
            System.out.println("Invalid coeffecients!");
            System.exit(0);
        }
        d = b*b - 4*a*c;
        if (d>0) {
            value1 = -b+Math.sqrt(d)/2*a;
            value2 = -b-Math.sqrt(d)/2*a;
            System.out.println("Roots of this equations are "+value1+","+value2);
            System.out.println("Roots are real and distinct");
        } else if(d==0){
            value1 = value2 = -b/(2*a);
            System.out.println("Roots of this equations are "+value1+","+value2);
            System.out.println("Roots are real and equal");
        }else{
            real = -b/(2*a);
            imag = Math.sqrt(Math.abs(d))/2*a;
            System.out.println("Roots of this equations are "+real+","+imag);
            System.out.println("Roots are complex and imaginary");
        }
        s.close();
    }
}
