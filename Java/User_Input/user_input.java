import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student sc = new Student();
        sc.RollNo = s.nextInt();
        sc.Mark = s.nextFloat();
        sc.Age = s.nextInt();
        System.out.println(sc.RollNo);
        System.out.println(sc.Mark);
        System.out.println(sc.Age);
        sc.run();
        sc.walk();
        sc.sleep();
        s.close();
    }
}

class Student {
    int RollNo;
    float Mark;
    int Age;
    void run() {
        System.out.println("I Am Running");
    }
    void walk() {
        System.out.println("I Am Running");
    }
    void sleep() {
        System.out.println("I Am Running");
    }
}