// Aim: Introduction to abstract classes, abstract methods, and Interface in 
// java.
// Program 7: Write a program to generate the resume. Create 2 Java classes Teacher (data: 
// personal information, qualification, experience, achievements) and Student (data: 
// personal information, result, discipline) which implements the java interface Resume 
// with the method biodata().
interface Resume {
    void biodata();
}

class Teacher implements Resume {
    String name, qualification, achievements;
    float experience;

    public void biodata() {
        name = "ABC";
        qualification = "M.Tech";
        achievements = "Best Teacher Awardee";
        experience = 10.5f;
        System.out.println("\bTeacher Resume");
        System.out.println("Name : " + name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Achievements : " + achievements);
        System.out.println("Experience : " + experience);
        System.out.println("Skill set: AI/ML , Big Data, Java, Python programming ");

    }
}

class Student implements Resume {
    String name, discipline;
    float result;

    public void biodata() {
        name = "ABC";
        result = 9.0f;
        discipline = "Information Science and Engineering";
        System.out.println("");
        System.out.println("Student Resume");
        System.out.println("Name : " + name);
        System.out.println("Result : " + result + " cgpa");
        System.out.println("Discipline : " + discipline);
        System.out.println("Highlights:Participated in Hackathons and other coding competitions");
    }
}

public class Lab7 {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher();
        obj1.biodata();
        Student obj2 = new Student();
        obj2.biodata();
    }
}