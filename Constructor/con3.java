class Main {
    public static void main(String[] args) {
Student s = new Student();

Student s1 = new Student(30, "Velan");

System.out.println(s.get());

System.out.println(s.set());

System.out.println(s1.get());

System.out.println(s1.set());
    }
}

class Student {
    int age;
    String name;
 Student() {    // Default Constructor
age = 20;
name = "Karthick";
}

Student(int a, String b) {     // Paramatrized Constructor.
    age = a;
    name = b;
}

int get() {
   return age;
}

String set() {
   return name;
}
}