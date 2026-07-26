

public class Main {
public static void main(String[] args) {
    Student s1 = new Student();

    s1.name = "Ajay";
    s1.rollno = 12;
    s1.marks = 89;

    System.out.println(s1.name);
    System.out.println(s1.rollno);
    System.out.println(s1.marks);

    s1.run();
    s1.study();
    s1.sleep();
}

}

class Student {
    String name;
    int rollno;
    int marks;

    void run() {
        System.out.println("running");
    }

    void study() {
        System.out.println("studying");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

    