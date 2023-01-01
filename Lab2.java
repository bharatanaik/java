import java.util.Scanner;

class Student{
    String usn, name, branch, phone;
    Scanner input = new Scanner(System.in);

   void read(){
        System.out.println("Enter USN: ");
        usn = input.nextLine();
        System.out.println("Enter name: ");
        usn = input.nextLine();
        System.out.println("Enter branch: ");
        usn = input.nextLine();
        System.out.println("Enter phone: ");
        usn = input.nextLine();
        System.out.println("\n\n");
    }

    void display(){
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phone);
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = input.nextInt();
        input.close();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Add student "+(i+1)+" detail: ");
            s[i].read();
        }
        System.out.println("Student details are as follows: ");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
