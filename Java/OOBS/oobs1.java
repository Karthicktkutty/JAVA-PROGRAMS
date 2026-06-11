public class Main {
public static void main(String[] args) {
    Employee s1 = new Employee();

    s1.name1 = "Ajay";
    s1.rollno1 = 12;
    s1.marks1 = 89;

    System.out.println(s1.name1);
    System.out.println(s1.rollno1);
    System.out.println(s1.marks1);

    s1.runs();
    s1.studys();
    s1.sleeps();

     Employee s2 = new Employee();

    s2.name1 = "Ajay";
    s2.rollno1 = 12;
    s2.marks1 = 89;

    System.out.println(s2.name1);
    System.out.println(s2.rollno1);
    System.out.println(s2.marks1);

    s2.runs();
    s2.studys();
    s2.sleeps();
}

}